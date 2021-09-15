package Graph;


import java.util.*;

public class Graph {
    List list = new ArrayList();
    public List<Node> allNodes = new ArrayList<Node>();

    public void addNode(String value) {
          Node node = new Node(value);
        allNodes.add(node);
    }
    public List<Node> getNeighbors(int index) {

        return this.allNodes.get(index).neighbors;
    }
    public List<Node> getNodes() {

        return this.allNodes;
    }
    public void addEdge(int i,int j,int c) {
        allNodes.get(i).cost= new int[][]{{i}, {c}};
        allNodes.get(i).neighbors.add(allNodes.get(j));
//        to.neighbors.add(this);
    }
    public int siz() {

        return allNodes.size();
    }
    public List bfs(Node startNode) {

        Queue<Node> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        List newList = new ArrayList();

        queue.add(startNode);
        visited.add(startNode.value);

        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            newList.add(currentNode.value);

            for (Node n : currentNode.neighbors) {
                if (!visited.contains(n.value)) {
                    queue.add(n);
                    visited.add(n.value);
                }
            }
        }
        return newList;
    }

    public List dfsIterative(Node startNode) {
        Stack<Node> stack = new Stack<>();
        Set<String> visited = new HashSet<>();
        List newList = new ArrayList();

        stack.push(startNode);

        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();

            if (!visited.contains(currentNode.value)) {
                newList.add(currentNode.value);
                visited.add(currentNode.value);
//                System.out.println(Arrays.deepToString(currentNode.cost));
            }

            for (Node n : currentNode.neighbors) {
                if (!visited.contains(n.value)) {
                    stack.push(n);
                }
            }
        }
        return newList;
    }

    public List dfsRecursive(Node startNode, Set<String> visited) {
        list.add(startNode.value);
        visited.add(startNode.value);

        for (Node n : startNode.neighbors) {
            if (!visited.contains(n.value)) {
                dfsRecursive(n, visited);
            }
        }
        return list;
    }

}