package Graph;

public class WeightedConnection extends Connection{

    int distance;

    public WeightedConnection(int node, int distance) {
        super(node);
        this.distance = distance;
    }

    @Override
    public int getNode() {
        return super.getNode();
    }

    public int getDistance() {
        return distance;
    }
}
