package queue;

public class BinaryTree<T> {
    public Node<T> root;
    int count = 1;
    int nextLevel = 1;
    //    n = n1 *2

    public BinaryTree() {

    }

    public BinaryTree(Node<T> root) {

        this.root = root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
    public Node<T> getRoot() {
        return root;
    }

    public void inOrder() {
        System.out.println("inOrder");
        traverseInOrder(this.root);
        System.out.println();
        count = 1;
        nextLevel = 1;
    }

    public void preOrder() {
        System.out.println("preOrder");
        traversePreOrder(this.root);
        System.out.println();
        count = 1;
        nextLevel = 1;
    }

    public void postOrder() {
        System.out.println("PostOrder");
        traversePostOrder(this.root);
        System.out.println();
        count = 1;
        nextLevel = 1;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                ", count=" + count +
                ", nextLevel=" + nextLevel +
                '}';
    }

    private void traverseInOrder(Node<T> node) {
        if (root == null)
            System.out.println("tree is empty");
        else if (node != null) {
            traverseInOrder(node.left);
            if (count == nextLevel * 2) {
                nextLevel *= 2;
                System.out.println();
            }
            System.out.print(" " + node.value);
            count++;
            traverseInOrder(node.right);
        }
    }


    private void traversePreOrder(Node<T> node) {

        if (root == null) {
            System.out.println("tree is empty");
        }

        if (node != null) {
            if (count == nextLevel * 2) {
                nextLevel *= 2;
                System.out.println();
            }
            System.out.print(" " + node.value);
            count++;
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }

    }


    private void traversePostOrder(Node<T> node) {
        if (root == null)
            System.out.println("tree is empty");
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            if (count == nextLevel * 2) {
                nextLevel *= 2;
                System.out.println();
            }
            System.out.print(" " + node.value);
            count++;
        }
    }

    public int findMaxVal() {
        return findMax(this.root);
    }

    private int findMax(Node node) {
        if (node == null)
            return Integer.MIN_VALUE;

        int result = (int) node.value;
        int lResult = findMax(node.left);
        int rResult = findMax(node.right);

        if (lResult > result)
            result = lResult;
        if (rResult > result)
            result = rResult;
        return result;
    }

}

