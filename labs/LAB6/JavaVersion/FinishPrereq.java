package labs.LAB6.JavaVersion;

import java.util.*;

public class FinishPrereq {
    
    @SuppressWarnings("unchecked")  //For type safety
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        //Initialize adjacency list, frequency list, and count for # of courses counted for (no more indegrees)
        List<Integer>[] adjList = new List[numCourses];
        int[] freq = new int[numCourses];
        int count = 0;

        //Creating adjLists and populating to represent graph, counting frequency of a prerequisite
        for(int[] prerequisite : prerequisites){        
            if(adjList[prerequisite[0]] == null){       //Checks if list for course has been created 
                adjList[prerequisite[0]] = new ArrayList<>();
            }
            adjList[prerequisite[0]].add(prerequisite[1]);  //Add the prerequisite for course in adjList
            freq[prerequisite[1]]++;
        }
        
    
        //Kahn's Algorithm
        Queue<Integer> q = new LinkedList<>();      //Create queue
        for(int i = 0; i < adjList.length; i++){    //Iterate through every course
            if(freq[i] == 0){
                q.offer(i);
                count++;
            }
        }

        while(!q.isEmpty()){
            int i = q.poll();   //Store and remove head of queue

            for(int j = 0;adjList[i] != null && j < adjList[i].size(); j++){     //Access every outdegree of i, stored in adjList[i]
                int x = adjList[i].get(j);      

                freq[x]--;  //Decrement indegree for x

                if(freq[x] == 0){       //If no indegree, add to queue
                    count++;
                    q.offer(x);
                }
            }
        }
        
        return count == numCourses;     //Cycle if # of 0 indegree nodes does not equal numCourses
    }
    
    public static void main(String[] args) {
        
        int numCourses = 3;
        int[][] prerequisites = {{2,0},{0,2}};
        
        FinishPrereq test = new FinishPrereq();

        System.out.println("Can finish all courses: " + test.canFinish(numCourses, prerequisites));

    }
}
