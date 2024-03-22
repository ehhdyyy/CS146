import TreeNode

tree = TreeNode

def inverseTree(self,root):
    if root == None:
        return root
    temp = TreeNode
    temp = root.left
    root.left = root.right
    root.right = root.left
    return root

def inOrder(self,root):
    if root == None:
        return
    inOrder(root,root.left)
    print(root.val, end=" ")
    inOrder(root,root.right)

root = tree.TreeNode(1)
root.left = tree.TreeNode(2)
root.left.left = tree.TreeNode(3)
root.left.right = tree.TreeNode(4)
root.right = tree.TreeNode(8)
root.right.left = tree.TreeNode(5)
root.right.right = tree.TreeNode(6)



print("Before: ", end= "")
inOrder(root,root)


inverseTree(root,root)

print("\nAfter: ", end= "")
inOrder(root,root)
