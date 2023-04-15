import utils.TreeNode;
import java.util.*;

public class Leetcode102 {
    Map<Integer, List<Integer>> map = new HashMap<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        int level = 0;
        traverse(root, level);
        for(int key : map.keySet()){
            result.add(map.get(key));
        }
        return result;
    }

    private void traverse(TreeNode root, int level){
        if(root == null)
            return;
        List<Integer> li = map.getOrDefault(level, new ArrayList<>());
        li.add(root.val);
        map.put(level, li);
        traverse(root.left, level + 1);
        traverse(root.right, level + 1);
    }
}
