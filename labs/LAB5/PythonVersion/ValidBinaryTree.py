import TreeNode

tree = TreeNode

def isValidBST(root):
    return isValid(root,None,None)

def isValid(root,min,max):
    if(root == None):
        return True
    if(min != None and root.val <= min) or (max != None and root.val >= max):
        return False
    return isValid(root.left, min, root.val) and isValid(root.right,root.val,max)

root = tree.TreeNode(4)
root.left = tree.TreeNode(3)
root.left.left = tree.TreeNode(1)
root.right = tree.TreeNode(8)
root.right.left = tree.TreeNode(5)
root.right.right = tree.TreeNode(9)


ans = isValidBST(root)
print("Valid BST: " + str(ans))