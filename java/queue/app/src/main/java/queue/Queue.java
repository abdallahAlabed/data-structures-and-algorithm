package queue;

public class Queue<T> {
    public Node front;
    public Node rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(T value) {
        Node newNode = new Node(value);
        if (this.isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() throws Exception {
        T dequeued = null;
        if (this.isEmpty()) {
            throw new Exception("queue is empty");
        } else {
            dequeued = (T) front.value;
            front = front.next;
        }
        return dequeued;
    }

    public T peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("queue is empty");
        } else {
            return (T) front.value;
        }
    }
}