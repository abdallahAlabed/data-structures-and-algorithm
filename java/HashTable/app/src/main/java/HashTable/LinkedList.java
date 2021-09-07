package HashTable;


public class LinkedList<S, T> {

    Node<S, T> head;
    Node<S, T> tail;

    public String toString() {
        String result = " [ ";

        Node<S, T> current = head;

        while (current != null) {
            result += "{" + current.key + ":" + current.data + "} ";
            current = current.next;
        }

        return result + "] ";
    }


    public void addLinkedlist(S kye,T data) {
        if (head == null){
            head= new  Node<S, T>(kye, data);
            tail =head;
        }else {
            tail.next=new  Node<S, T>(kye, data);
            tail=tail.next;
        }
    }
}