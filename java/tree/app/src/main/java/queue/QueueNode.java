package queue;

public class QueueNode <T>{
    public T value;
    public QueueNode next;

    public QueueNode(T value) {
        this.value = value;
    }
}
