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
    public void insert(int data) {
        // Create a new node
        Node newNode = new Node(data);
        // Checks if the list is empty
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // includes
    public boolean includes(int data) {
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

    // display() will display all the nodes present in the list and retun them in
    // string
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

    // Appends a new node at the end. This method is defined inside LinkedList class
    // shown above
    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }

    public void insertBefore(int val, int newVal) {
        if (head != null) {
            if (val == head.data) {
                Node newNode = new Node(newVal);
                newNode.next = head;
                head = newNode;
                // 1
                // insertBefore(1,3);
                // 3 -> 1
                // head = newNode // head = 3
            } else {
                Node current = head;
                Node previousNode = current;
                while (current != null) {
                    if (val == current.data) {
                        Node newNode = new Node(newVal);
                        newNode.next = current;
                        previousNode.next = newNode;
                        break;
                        // 1-> 3 -> 4
                        // insertBefore(3,2);
                        // current -> 3 ,previousNode -> 1
                        // newNode = 2 -> null
                        // newNode.next = current 1 -> 3 2-> 3 - > 4
                        // previousNode.next = newNode 1 -> 2 -> 3 - > 4
                    }
                    previousNode = current;
                    current = current.next;
                }
            }
        } else {
            System.out.println("the list is empty");
        }
    }

    public void insertAfter(int val, int newVal) {
        if (head != null) {
            if (val == tail.data) {
                Node newNode = new Node(newVal);
                tail.next = newNode;
                tail = newNode;
                // 1-> 3 -> 4
                // insertAfter(4,5);
                // newNode = 5 -> null
                // tail.next = newNode
                // 1-> 3 -> 4 - > 5 // tail = 4
                // tail = newNode; tail = 5
            } else if (head.next == null) {
                if (val == head.data) {
                    Node newNode = new Node(newVal);
                    head.next = newNode;
                    tail = newNode;
                    // 1 -> null
                    // insertAfter(1,2);
                    // newNode = 2 -> null
                    // head.next = newNode ; 1 -> 2 // tail = 1
                    // tail = newNode; tail = 2
                }
            } else {
                Node current = head;
                Node nextCurrent = current.next;
                // 1-> 3 -> 4 // current = 1 // nextCurrent = 3
                // insertAfter(1,2);
                // newNode = 2 -> null
                // newNode.next = nextCurrent // 1-> 3 -> 4 /2-> 3-> 4
                // current.next = newNode // 1-> 2-> 3-> 4
                while (current != null) {
                    if (val == current.data) {
                        Node newNode = new Node(newVal);
                        newNode.next = nextCurrent;
                        current.next = newNode;
                        break;
                    }
                    if (current.next != null) {
                        current = nextCurrent;
                        nextCurrent = nextCurrent.next;
                        // 1 -> 2 -> null //current = 2 nextCurrent =null nextCurrent.next ? null.next x
                    } else {
                        current = nextCurrent;
                    }
                }
            }
        } else {
            System.out.println("the list is empty");
        }

    }

    // takes k index and returns the node data from index k from end of the list
    public int findKFromEnd(int k) throws IndexOutOfBoundsException {
        if (k < 0) {
            throw new IndexOutOfBoundsException("k is not a positive integer");
        } else if (head == null) {
            throw new IndexOutOfBoundsException("list length is zero");
        } else {
            Node current = this.head;
            while (current != null) {

                Node kFinder = current;

                for (int i = 0; i < k; i++) {

                    if (kFinder.next == null && i != k - 1) {

                        throw new IndexOutOfBoundsException("list Out Of Bounds");

                    }

                    kFinder = kFinder.next;
                }

                if (kFinder.next == null) {
                    return current.data;
                }

                current = current.next;

            }

            throw new IndexOutOfBoundsException("list Out Of Bounds");
        }
    }

    public static SinglyLinkedLists zipLists(SinglyLinkedLists list, SinglyLinkedLists list0) {
        Node current = list.head;
        Node current0 = list0.head;
        if (current == null && current0 == null) {
            return null;
        }else if (current == null) {
            return list0;
        }else if (current0 == null) {
            return list;
        } else {            
            SinglyLinkedLists newList = new SinglyLinkedLists();
            while (current != null || current0 != null) {

                if (current != null) {
                    newList.addNode(current.data);
                    current = current.next;
                }

                if (current0 != null) {
                    newList.addNode(current0.data);
                    current0 = current0.next;
                }
            }
            return newList;
        }
    }
    SinglyLinkedLists reverseList(SinglyLinkedLists list) {
        
        Node current = list.head;
        Node previous = null;
        Node nextElement=null;
        while (current != null) {
            nextElement = current.next;
            current=previous.next;
            previous = current;
            current = nextElement;
        }

        return list;
    }
    // public void insertAfter(Node prev_node, int new_data)
    // {
    // /* 1. Check if the given Node is null */
    // if (prev_node == null)
    // {
    // System.out.println("The given previous node cannot be null");
    // return;
    // }

    // /* 2 & 3: Allocate the Node &
    // Put in the data*/
    // Node new_node = new Node(new_data);

    // /* 4. Make next of new Node as next of prev_node */
    // new_node.next = prev_node.next;

    // /* 5. make next of prev_node as new_node */
    // prev_node.next = new_node;
    // }
};