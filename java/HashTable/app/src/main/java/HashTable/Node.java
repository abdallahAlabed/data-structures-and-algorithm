package HashTable;

public class Node<String,T> {
    public String key;
    public T data;
    public Node next;

    public Node(String key, T value) {
        this.key = key;
        this.data = value;
    }
}