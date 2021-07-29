package singlyLinkedLists;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedLists sList = new SinglyLinkedLists();
        // Add nodes to the last of list
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        // Add nodes to the front fo list
        sList.insert(1);
        sList.insert(0);
        // search on val
        sList.includes(5);
        sList.includes(2);
        // Displays the nodes present in the list and return them in String
        sList.display();

    }
}
