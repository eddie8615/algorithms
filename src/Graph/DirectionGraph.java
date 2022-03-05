package Graph;

import java.util.*;

public class DirectionGraph {
    int V;

    List<DirectedConnection> graph;

    public DirectionGraph(int v){
        V = v;
        graph = new ArrayList<>();
    }

    public void addConnection(int fromNode, int toNode){
        graph.add(new DirectedConnection(fromNode, toNode));
    }

    public static void main(String[] args){
        DirectionGraph graph = new DirectionGraph(10);
        graph.addConnection(0, 1);
        graph.addConnection(0, 9);
        graph.addConnection(0, 5);
        graph.addConnection(1, 3);
        graph.addConnection(4, 5);
        graph.addConnection(7, 2);
        graph.addConnection(9, 4);
        graph.addConnection(3, 4);
        graph.addConnection(1, 7);
        graph.addConnection(3, 9);
        graph.addConnection(5, 7);
        graph.addConnection(2, 1);
        graph.addConnection(5, 6);
        graph.addConnection(6, 8);

        System.out.println("BFS");
        graph.bfs(2);

        System.out.println("DFS");
        graph.dfs(2);
    }

    public void bfs(int start){
        boolean[] isVisited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        isVisited[start] = true;
        while(!queue.isEmpty()){
            int con = queue.poll();
            isVisited[con] = true;
            System.out.printf("Node %d visited", con);
            System.out.println();
            for(DirectedConnection connection : graph){
                if(connection.node == con && !isVisited[connection.destination]){
                    queue.add(connection.destination);
                }
            }
        }
    }

    public void dfs(int start){
        boolean[] isVisited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        isVisited[start] = true;
        while(!stack.isEmpty()){
            int node = stack.pop();
            System.out.printf("Node %d visited", node);
            System.out.println();
            for(DirectedConnection conn : graph){
                if(conn.node == node && !isVisited[conn.destination]){
                    stack.push(conn.destination);
                }
            }
        }
    }
}
