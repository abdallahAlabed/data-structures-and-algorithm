package queue;

public class PseudoQueue <T> {
    public Stack<T> firstStack;
    public Stack<T> secondStack;

    public PseudoQueue() {
        this.firstStack = new Stack<>();
        this.secondStack = new Stack<>();
    }

    public void enqueue(T value) {
        firstStack.push(value);
    }

    public T dequeue() throws Exception {
        while (firstStack.top != null){
            secondStack.push(firstStack.pop());

        }

        T val = secondStack.pop();

        while (secondStack.top != null){

            firstStack.push(secondStack.pop());
        }
        return val;
    }

    @Override
    public String toString() {
        String str = "";
        Node current = firstStack.top;
        while (current != null){
            str+="["+current.value+"]->";
            current = current.next;
        }
        str+="NULL";
        return str;
    }
}
