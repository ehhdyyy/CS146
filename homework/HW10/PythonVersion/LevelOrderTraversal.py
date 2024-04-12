from typing import List, Optional
from TreeNode import TreeNode 

tree = TreeNode     #Variable to use TreeNode defs

#levelOrder definition
def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
    order = []

    if root is None:
        return order
    
    queue = []      

    queue.append(root)  #Insert root node into queue
    
    #Loop to insert nodes into a List, then insert List to Final List
    while len(queue) > 0:
        levelSize = len(queue)
        levelNodes = []

        #Inserting # of nodes based on length of queue
        for i in range(levelSize):
            curr = queue.pop(0)         #Making list like a queue by popping index 0
            levelNodes.append(curr.val)
            if curr.left is not None:
                queue.append(curr.left)
            if curr.right is not None:
                queue.append(curr.right)

        order.append(levelNodes)     #Insert nodes list into final list 
    
    return order

#Construct nodes
x = tree.TreeNode(None)
root = tree.TreeNode(4)
root.left = tree.TreeNode(3)
root.left.left = tree.TreeNode(1)
root.right = tree.TreeNode(8)
root.right.left = tree.TreeNode(5)
root.right.right = tree.TreeNode(9)

#Test Case (root is None)
test = levelOrder(x,x)
print("Level Order (null node): ", end = "")
print(test)

#Test Case 
test = levelOrder(root,root)
print("Level Order: ", end="")
print(test)
