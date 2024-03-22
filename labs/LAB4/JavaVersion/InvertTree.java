package labs.LAB4.JavaVersion;

public class InvertTree{
    
    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return root;
        }
        TreeNode temp = new TreeNode();     //Swapping
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    //inOrder method to test if tree has been inverted
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        InvertTree test = new InvertTree();

        System.out.print("Before: ");
        test.inOrder(root);
        
        test.invertTree(root);
        
        System.out.print("\nAfter: ");
        test.inOrder(root);
        


    }
}
