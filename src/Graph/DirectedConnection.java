package Graph;

public class DirectedConnection extends Connection{

    int destination;

    public DirectedConnection(int node, int destination) {
        super(node);
        this.destination = destination;
    }


}
