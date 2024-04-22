class SupplyWaterMinCost:

    def findIndex(target,setsList):
        for i in range(len(setsList)):
            set = setsList[i]
            for numInSet in set:
                for num in numInSet:
                    if target == num:
                            return i
        return -1
    
    def minCostToSupplyWater(n, wells, pipes):
        edges = []
        sets = []
        cost = 0

        for house in range(len(wells)):
            edges.append([0,house + 1, wells[house]])
        
        for house in pipes:
            edges.append(house)
        
        edges.sort(key=lambda x: x[2])

        for set in edges:
            house1 = set[0]
            house2 = set[1]

            firstSetIndex = SupplyWaterMinCost.findIndex(house1,sets)
            secondSetIndex = SupplyWaterMinCost.findIndex(house2, sets)

            if firstSetIndex != -1 and secondSetIndex != -1 and firstSetIndex != secondSetIndex:
                sets[firstSetIndex].extend(sets[secondSetIndex])
                sets.pop(secondSetIndex)
                cost += set[2]

            elif firstSetIndex == -1 and secondSetIndex == -1:
                newSet = [[set[0],set[1]]]
                sets.append(newSet)
                cost += set[2]
            
            elif firstSetIndex != -1 and secondSetIndex == -1:
                sets[firstSetIndex].append([set[0],set[1]])
                cost += set[2]
            
            elif firstSetIndex == -1 and secondSetIndex != -1:
                sets[secondSetIndex].append([set[0],set[1]])
                cost += set[2]
            
            if len(sets) == 1 and len(sets[0]) == n:
                break
        
        return cost

houses = 4
wells = [2,1,4,6]
pipes = [[1,2,1], [2,3,5]]

test = SupplyWaterMinCost
print("Test 1 Minimum Cost: " + str(test.minCostToSupplyWater(houses,wells,pipes)))

houses = 4
wells = [3,9,6,11]
pipes = [[1,3,5],[2,1,4],[3,4,2]]

print("Test 2 Minimum Cost: " + str(test.minCostToSupplyWater(houses,wells,pipes)))