package queue;

public class BinarySearchTree<T> extends BinaryTree <T>{

    public BinarySearchTree(){
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
        if ((Integer)value < (Integer) current.value) {
            current.left = addRecursive(current.left, value);
//            System.out.println(current.left.value);
        } else if ((Integer)value > (Integer) current.value) {
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
        if ((Integer)value < (Integer)current.value) {
             containsNodeRecursive(current.left, value);
        } else {
             containsNodeRecursive(current.right, value);
        }
        return false;
    }

}