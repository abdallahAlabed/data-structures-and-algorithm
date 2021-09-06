package HashTable;


public class LinkedList<String,T> {

    Node<String,T> head;

    public java.lang.String toString(){
        java.lang.String result = " [ ";

        Node<String,T> current = head;

        while (current != null) {
            result  += "{"+ current.key+ ":" + current.data + "} ";
            current = current.next;
        }

        return result + "] ";
    }
}