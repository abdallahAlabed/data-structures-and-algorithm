package HashTable;

public class Node<S,T> {
    public S key;
    public T data;
    public Node next;

    public Node(S key, T data) {
        this.key = key;
        this.data = data;
    }
}