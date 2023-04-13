package Search;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Leetcode question practice 116: Populating right next pointers in Each node.
 */
public class Leetcode116 {
    class Node{
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node(){}
        public Node(int val){this.val = val;}
        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }

    /**
     * Method 1: BFS approach using queue
     * @param root
     * @return
     */
    public Node connect(Node root){
        if(root == null){
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Node prev = queue.poll();
            if(prev.left != null){
                queue.add(prev.left);
                queue.add(prev.right);
            }
            for(int i = 1; i < size; i++){
                Node curr = queue.poll();
                prev.next = curr;
                if(curr.left != null){
                    queue.add(curr.left);
                    queue.add(curr.right);
                }
                prev = curr;
            }
        }
        return root;
    }

    /**
     * Method 2: DFS approach using recursive
     */
    public Node connect1(Node root){
        if(root == null)
            return root;

        dfs(root.left, root.right);
        return root;
    }

    public void dfs(Node left, Node right){
        if(left == null)
            return;
        left.next = right;
        dfs(left.left, left.right);
        dfs(left.right, right.left);
        dfs(right.left, right.right);
    }

    /**
     * Method 2: BFS using iterative
     */

    public Node connect3(Node root){
        if(root == null)
            return root;

        Node level = root;
        while(level.left != null){
            Node curr = level;
            while(curr != null){
                curr.left.next = curr.right;
                if(curr.next != null)
                    curr.right.next = curr.next.left;
                curr = level.next;
            }
            level = level.left;
        }
        return root;
    }

}
