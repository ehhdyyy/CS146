package homework.HW12.JavaVersion;

import java.util.*;

public class SupplyWaterMinCost {
    
    @SuppressWarnings("unchecked")
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {

        return 0;

        
    }

    public static void main(String[] args) {
        int houses = 2;
        int[] wells = {1,1};
        int[][]pipes = {{1,2,1}, {1,2,2}};

        SupplyWaterMinCost test = new SupplyWaterMinCost();
        System.out.println(test.minCostToSupplyWater(houses, wells, pipes));
    }
}
