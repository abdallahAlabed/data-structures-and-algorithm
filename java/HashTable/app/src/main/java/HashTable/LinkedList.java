package HashTable;


public class LinkedList<s,T> {

    Node<s,T> head;

    public String toString(){
        String result = " [ ";

        Node<s,T> current = head;

        while (current != null) {
            result  += "{"+ current.key+ ":" + current.data + "} ";
            current = current.next;
        }

        return result + "] ";
    }
}