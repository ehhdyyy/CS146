package homework.HW9.JavaVersion;


public class LCAofTwoNodes{

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        else{
            return root;
        }

    }
    public static void main(String[] args) {
        LCAofTwoNodes test = new LCAofTwoNodes();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        /* Given tree:
         *     4
         *    / \ 
         *   3   8
         *  /   / \
         * 1   5   9
         */

        TreeNode p = root.right;        //Test Variable
        TreeNode q = root.right.left;   //Test Variable
        

        TreeNode ans = test.lowestCommonAncestor(root, p, q);
        System.out.println("LCA (" + p.val + ","+ q.val + "): " + ans.val);

    }
    
}

