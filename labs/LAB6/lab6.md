# Lab 6 Markdown

## Problem: There are a total of `numCourses` courses you have to take, labeled from `0` to `numCourses-1`. You are given an array `prerequisites` where `prerequisites[i] = [a,b]` indicates that you <b>must</b> take courses `b` first if you want to take course `a`. 
 
### Insights:
* Needs topological sort
  * Kahn's Algorithm*
  * DFS/BFS
* Returns a `boolean` if prerequisites can be completed
* Adjacency list should have a length of the number of courses, adj[i] for each i < numCourses
* Can use adjacency list for `b` and add its indegrees `a` 
* Keep track of the number of times a prerequisite is required, freq[]
  * Will be used in Queue
  * If no freq[i] value == 0, that means each `b` requires a class, and contains cycle
* Everytime freq[i] == 0, add to Queue and increment a count variable
  * Count will be used in return statement, if Count == numCourses all courses can be finished
* Queue:
  * Remove the head and store its value into a variable [i]
  * For loop to iterate through every value in adjList[i], then decrement the frequency of that value
  * Check if values of freq[x] == 0, if so add to Queue and increment count variable

***
```
Method/Function (canFinish):
    -Create a list of integers of numCourses length
    -Create an array called freq of numCourses length
    -Create a count variable used to check if all courses have no more indegrees
    
    -Populate adjList for every prerequisite array by adding the b value into adj[a]
    -Increment the frequenecy of preq[b] by 1

    -Kahn's Algorithm
        -Initialize a queue
        -In a for loop, traverse through every array in adjList and check if the frequencey of i is 0. This means i is not a prerequisite for courses
            -Add queue if freq[i] == 0
            -Increment count by 1
        -While queue is not empty:
            -Remove and store the head
            -In a for loop, get the value of every adjList[headOfQueue]
            -Decrement the frequency of that value
            -Check if any freq[x]
    -Return count == numCourses, true = courses can be finished
