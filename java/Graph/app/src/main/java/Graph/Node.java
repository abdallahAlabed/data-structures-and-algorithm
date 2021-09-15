package Graph;

import java.util.ArrayList;
import java.util.List;

public class Node{

    public int[][] cost;
    public String value;
    List<Node> neighbors;

    public Node(String value) {
        this.cost= new int[][]{};
        this.value = value;
        neighbors = new ArrayList<>();

    }

//    public void addEdge(Node to) {
//        neighbors.add(to);
//    }
//
//    public int siz() {
//        int count = 0;
//        for (int i = 0; i < this.neighbors.size(); i++) {
//            count += neighbors.get(i).neighbors.size() + 2;
//        }
//
//        return count;
//    }

}