package queue;

public class Stack<T> {
    public Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T value) {
        Node newNode = new Node(value);
        if (this.isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public T pop() throws Exception {
        T poped = null;
        if (this.isEmpty()) {
            throw new Exception("stack is empty");
        } else {
            poped = (T) top.value;
            top = top.next;
        }
        return poped;
    }

    public T peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("stack is empty");
        } else {
            return (T) top.value;
        }
    }
}