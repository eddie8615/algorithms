package Graph;

public abstract class Connection {
//    Weighted graph
    int node;

    public Connection(int node){
        this.node = node;
    }

    public int getNode(){
        return node;
    }


}
