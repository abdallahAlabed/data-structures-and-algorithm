package queue;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T> extends BinaryTree<T> {

    public BinarySearchTree() {
        super();

    }

    public BinarySearchTree(Node<T> root) {
        super(root);
    }

    public void add(T value) {
        root = this.addRecursive(this.root, value);
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root.value +
                ", count=" + count +
                ", nextLevel=" + nextLevel +
                '}';
    }

    private Node<T> addRecursive(Node<T> current, T value) {
        if (current == null) {
            return new Node(value);

        }
        if ((Integer) value < (Integer) current.value) {
            current.left = addRecursive(current.left, value);
//            System.out.println(current.left.value);
        } else if ((Integer) value > (Integer) current.value) {
            current.right = addRecursive(current.right, value);
//            System.out.println(current.right.value);
        } else {
            System.out.println("you cant add the same number ");
            return current;
        }
        return current;
    }

    public boolean containsNodeRecursive(Node<T> current, T value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        if ((Integer) value < (Integer) current.value) {
            containsNodeRecursive(current.left, value);
        } else {
            containsNodeRecursive(current.right, value);
        }
        return false;
    }

    public List<T> breadthFirst() throws Exception {
        return breadthFirst1(this);
    }

    private List<T> breadthFirst1(BinarySearchTree<T> tree) throws Exception {
        Queue<Node> breadth = new Queue<>();
        List<T> breadthList = new ArrayList<>();

        if (tree.root != null)
            breadth.enqueue(tree.root);

        while (!breadth.isEmpty()) {
            Node current = breadth.dequeue();
            breadthList.add((T) current.value);
            if (current.left != null)
                breadth.enqueue(current.left);
            if (current.right != null)
                breadth.enqueue(current.right);
        }
        return breadthList;
    }


}