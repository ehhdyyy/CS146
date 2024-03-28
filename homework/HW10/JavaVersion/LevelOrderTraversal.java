package homework.HW10.JavaVersion;
import java.util.*;


public class LevelOrderTraversal{

    //levelOrder Method
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> order = new ArrayList<List<Integer>>();

        if(root == null){
            return order;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);

        //Loop to insert nodes into a list, then insert List into Final List
        while(!queue.isEmpty()){            //Loop until every node is in a list
            int levelSize = queue.size();
            List<Integer> levelNodes = new ArrayList<>();

            //Inserting # of nodes based on length of queue
            for(int i = 0; i < levelSize; i++){
                TreeNode curr = queue.poll();
                levelNodes.add(curr.val);
                if(curr.left != null){      //Insert curr node's children(s) into queue
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                } 
            }
            order.add(levelNodes);       //Insert levelNodes into final list
        }

        return order;
    }

    public static void main(String[] args) {
        
        TreeNode x = null;
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        LevelOrderTraversal test = new LevelOrderTraversal();

        //Test Case (root is null)
        List<List<Integer>> ans = test.levelOrder(x);
        System.out.println("Level Order (null): " + ans);

        //Test Case
        ans = test.levelOrder(root);
        System.out.println("Level Order: " + ans);

    }

}