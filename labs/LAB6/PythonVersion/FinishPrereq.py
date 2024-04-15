from collections import deque

class Prereq:
    
    def canFinish(numCourses, prerequisites):
        adjList = [[] for _ in range(numCourses)]
        freq = [0] * numCourses
        count = 0

        for prerequisite in prerequisites:
            adjList[prerequisite[0]].append(prerequisite[1])
            freq[prerequisite[1]] += 1
        
        q = deque()
        for i in range(numCourses):
            if freq[i] is 0:
                q.append(i)
                count += 1
        
        while q:
            i = q.popleft()

            for x in adjList[i]:
                freq[x] -= 1
                
                if freq[x] == 0:
                    count += 1
                    q.append(x)
                
        return count == numCourses

numCourses = 3
prerequisites = [[2,0],[0,2]]

test = Prereq

print("Can finish all courses: " + str(test.canFinish(numCourses,prerequisites)))
            



