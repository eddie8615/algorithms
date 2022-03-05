package Graph;

import java.util.*;

public class Graph {
    int V; // number of vertices
    List<Vertex> graph;

    public Graph(int v){
        this.V = v;
        graph = new ArrayList<>();
        for(int i = 0; i < v; i++){
            Vertex vertex = new Vertex(i);
            if(i == 0){
                vertex.addNeighbours(1);
                vertex.addNeighbours(2);
            }
            if(i == 1){
                vertex.addNeighbours(0);
            }
            if(i == 2){
                vertex.addNeighbours(0);
                vertex.addNeighbours(3);
                vertex.addNeighbours(4);
            }
            if(i == 3){
                vertex.addNeighbours(2);
                vertex.addNeighbours(4);
            }
            if(i == 4){
                vertex.addNeighbours(2);
                vertex.addNeighbours(3);
            }
            graph.add(vertex);
        }

    }

    public void dfs(int start){
        Stack<Vertex> stack = new Stack<>();
        if(start >= graph.size()){
            System.out.println("The node does not exist in the graph");
            return;
        }
        stack.add(graph.get(start));
        while(!stack.isEmpty()){
            Vertex v = stack.pop();
            if(!v.isVisited){
                System.out.printf("Node %d visited", v.node);
                System.out.println();
                v.isVisited = true;
            }

            List<Integer> neighbours = v.getNeighbours();
            for(int node : neighbours){
                if(!graph.get(node).isVisited)
                    stack.add(graph.get(node));
            }
        }
    }

    public void bfs(int start){
        Queue<Vertex> queue = new LinkedList<>();
        if(start >= graph.size()){
            System.out.println("The node does not exist");
            return;
        }

        queue.add(graph.get(start));
        while(!queue.isEmpty()){
            Vertex v = queue.poll();
            if(!v.isVisited){
                v.isVisited = true;
                System.out.printf("Node %d visited", v.node);
                System.out.println();
            }
            List<Integer> neighbours = v.getNeighbours();
            for(int node : neighbours){
                if(!graph.get(node).isVisited)
                    queue.add(graph.get(node));
            }
        }

    }

    public static void main(String[] args){
        Graph graph1 = new Graph(5);
        Graph graph2 = new Graph(5);

        System.out.println("DFS method");
        graph1.dfs(2);

        System.out.println("BFS method");
        graph2.bfs(2);
    }

}
