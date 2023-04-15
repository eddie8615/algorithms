import utils.Node;
import java.util.*;

class Leetcode589 {
    public List<Integer> preorder(Node root){
        List<Integer> visited = new ArrayList<>();
        traverse(root, visited);
        return visited;
    }

    private void traverse(Node root, List<Integer> visited){
        visited.add(root.val);
        for(Node node : root.children){
            traverse(node, visited);
        }
    }
}