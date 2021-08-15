package queue;

public class Node <T> {
    public T value;
    public Node<T> left;
    public Node <T>right;


    public Node(T value, queue.Node<T> left, queue.Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(T value) {

        this.value = value;
    }
}