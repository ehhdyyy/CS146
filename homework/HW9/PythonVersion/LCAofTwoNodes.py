import TreeNode     #Import TreeNode.py

tree = TreeNode     #Create variable to use TreeNode.py

class LCAofTwoNodes:

    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root is None or p is None or q is None:
            return None
        if root.val > p.val and root.val > q.val:
            return  self.lowestCommonAncestor(root.left, p , q)
        elif root.val < p.val and root.val < q.val:
            return self.lowestCommonAncestor(root.right, p , q)
        else:
            return root


#Create given tree
root = tree.TreeNode(4) 
root.left = tree.TreeNode(3)
root.left.left = tree.TreeNode(1)
root.right = tree.TreeNode(8)
root.right.left = tree.TreeNode(5)
root.right.right = tree.TreeNode(9)

#Get test variables
p = root.right.left
q = root.right

#Variable to use lca function
test = LCAofTwoNodes()


ans = test.lowestCommonAncestor(root,p,q)

print("LCA (" + str(p.val) + ", " + str(q.val) + "): " + str(ans.val))



