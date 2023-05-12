import utils.TreeNode;

public class Leetcode1448 {
    public int goodNodes(TreeNode root) {
        int largest = Integer.MIN_VALUE;

        return traverse(root, largest);
    }
    private int traverse(TreeNode root, int largest){
        if(root == null)
            return 0;
        int goodNode = 0;
        if(root.val >= largest){
            goodNode++;
            largest = root.val;
        }
        return goodNode + traverse(root.left, largest) + traverse(root.right, largest);
    }
}
