package homework.HW12.JavaVersion;

import java.util.*;
import java.util.Comparator;

public class SupplyWaterMinCost {
    
    public int findIndex(int target,ArrayList<ArrayList<int[]>> setsList){
        for(int i = 0; i < setsList.size(); i++){
            ArrayList<int[]> set = setsList.get(i);
            for(int[] numInSet : set){
                for(int theNum : numInSet){
                    if(target == theNum){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {

        ArrayList<int[]> edges = new ArrayList<>();
        ArrayList<ArrayList<int[]>> sets = new ArrayList<>();
        int cost = 0;

        for(int house = 0; house < wells.length; house++){
            int[] x = {0, house + 1, wells[house]};
            edges.add(x);
        }
        
        for(int[] house : pipes){
            edges.add(house);
        }

        Collections.sort(edges, Comparator.comparingInt(a -> a[2]));

        for(int[] set : edges){
            int house1 = set[0];
            int house2 = set[1];

            int firstSetIndex = findIndex(house1, sets);
            int secondSetIndex = findIndex(house2, sets);

            if(firstSetIndex != -1 && secondSetIndex != -1 && firstSetIndex != secondSetIndex){ //Both are in different sets, merge
                sets.get(firstSetIndex).addAll(sets.get(secondSetIndex));
                sets.remove(secondSetIndex);
                cost += set[2];
            }

            else if(firstSetIndex == -1 && secondSetIndex == -1){ //Both are not in a set
                ArrayList<int[]> newSet = new ArrayList<>();
                int[] tempSet = {set[0],set[1]};
                newSet.add(tempSet);
                sets.add(newSet);
                cost += set[2];
            }
            else if(firstSetIndex != -1 && secondSetIndex == -1){ //If one is in set, and another is not in a set
                int[] tempSet = {set[0],set[1]};
                sets.get(firstSetIndex).add(tempSet);
                cost += set[2];
            }
            else if(firstSetIndex == -1 && secondSetIndex != -1){
                int[] tempSet = {set[0],set[1]};
                sets.get(secondSetIndex).add(tempSet);
                cost += set[2];
            }

            if(sets.size() == 1 && sets.get(0).size() == n){ //Only one set left and all 'houses' are accounted for
                break;
            }
        }
                    
        return cost;
    }

    public static void main(String[] args) {
        int houses = 4;
        int[] wells = {2,1,4,6}; // {0,1,2}, {0,2,1}, {0,3,4}, {0,4,6}
        int[][] pipes = {{1,2,1}, {2,3,5}};

        SupplyWaterMinCost test = new SupplyWaterMinCost();
        System.out.println("Test 1 Minimum Cost: " + test.minCostToSupplyWater(houses, wells, pipes)); //Should return 12

        int houses2 = 4;
        int[] wells2 = {3,9,6,11};
        int[][] pipes2 =  {{1,3,5},{2,1,4},{3,4,2}};
        System.out.println("Test 2 Minimum Cost: "+ test.minCostToSupplyWater(houses2, wells2, pipes2)); //Should return 14
    }
}
