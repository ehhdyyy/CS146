package labs.LAB5.JavaVersion;


public class ValidBinaryTree {
    
    public boolean isValidBST(TreeNode root){
        return isValidBST(root,null,null);
    }

    public boolean isValidBST(TreeNode root, Integer min, Integer max){
        if(root == null){
            return true;
        }
        if((min != null && root.val <= min) || (max != null && root.val >= max)){
            return false;
        }
        return (isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max));
    }

    public static void main(String[] args) {
        ValidBinaryTree test = new ValidBinaryTree();

        //Create test binary tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        boolean ans = test.isValidBST(root);
        System.out.println("Valid BST: "+ ans);

    }
}
