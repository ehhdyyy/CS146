from collections import deque

class Prereq:
    
    def canFinish(numCourses, prerequisites):
        adjList = [[] for _ in range(numCourses)] #Creates empty arrays for # of courses
        freq = [0] * numCourses     #Creates array of numCourses length with values set to 0
        count = 0

        for prerequisite in prerequisites:
            adjList[prerequisite[0]].append(prerequisite[1])
            freq[prerequisite[1]] += 1
        
        q = deque()
        for i in range(numCourses):
            if freq[i] == 0:
                q.append(i)
                count += 1
        
        while q:
            headOfQueue = q.popleft()

            for currValue in adjList[headOfQueue]:
                freq[currValue] -= 1
                
                if freq[currValue] == 0:
                    q.append(currValue)
                    
                
        return count == numCourses

numCourses = 3
prerequisites = [[2,0],[0,2]]

test = Prereq

print("Can finish all courses: " + str(test.canFinish(numCourses,prerequisites)))
            



