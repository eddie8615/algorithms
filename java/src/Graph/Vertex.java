package Graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex extends Connection{

    boolean isVisited;
    List<Integer> neighbours;

    public Vertex(int node) {
        super(node);
        neighbours = new ArrayList<>();
    }

    public void addNeighbours(int element){
        this.neighbours.add(element);
    }

    public List<Integer> getNeighbours(){
        return this.neighbours;
    }

    public void setVisited(){
        isVisited = true;
    }

    public boolean isVisited(){
        return isVisited;
    }
}
