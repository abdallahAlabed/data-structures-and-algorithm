package singlyLinkedLists;

public class SinglyLinkedLists {

    // Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    // addNode() will add a new node to the list
    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data);
        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
            tail = newNode;
        }
    }

    // insert (add from end)
    void insert(int data) {
        // Create a new node
        Node newData = new Node(data);
        // Checks if the list is empty
        if (head == null) {
            head = newData;
            tail = head;
        } else {
            tail.next = newData;
            tail = newData;
        }
    }

    // includes
    boolean includes(int data) {
        if (head != null) {
            Node current = head;
            while (current != null) {
                if (data == current.data) {
                    System.out.println("is include");
                    return true;
                }
                current = current.next;
            }
        }
        System.out.println("is not include");
        return false;
    }

    // display() will display all the nodes present in the list and retun them in string
    public String display() {
        // Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return "";
        } else {
            System.out.println("Nodes of singly linked list: ");
            String stringList = "";
            while (current != null) {
                // Prints each node by incrementing pointer
                stringList = "{" + current.data + "}" + "-> ";
                System.out.print("{" + current.data + "}" + "-> ");
                current = current.next;
            }
            System.out.println("Null");
            return stringList + "NUll";
        }
    }

};