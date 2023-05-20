import utils.TreeNode;

public class Leetcode104 {
    public int maxDepth(TreeNode root) {
        return traverse(root, 0);
    }
    private int traverse(TreeNode root, int level){
        if(root == null)
            return level;
        return Math.max(traverse(root.left, level + 1), traverse(root.right, level + 1));
    }
}
