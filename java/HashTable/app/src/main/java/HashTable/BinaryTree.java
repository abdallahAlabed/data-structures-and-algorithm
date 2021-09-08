package HashTable;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree< T> {
    public TreeNode< T> root;
    int count = 1;
    int nextLevel = 1;
    //    n = n1 *2
    List<T> preOrderList = new ArrayList<>();

    public BinaryTree() {

    }

    public BinaryTree(TreeNode< T> root) {

        this.root = root;
    }

    public void setRoot(TreeNode< T> root) {
        this.root = root;
    }

    public TreeNode< T> getRoot() {
        return root;
    }

    public void inOrder() {
        System.out.println("inOrder");
        traverseInOrder(this.root);
        System.out.println();
        count = 1;
        nextLevel = 1;
    }

    public List<T> preOrder(TreeNode< T> root) {
        try {
            preOrderList.add(root.data);
            if (root.left != null) preOrder(root.left);
            if (root.right != null) preOrder(root.right);
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        return preOrderList;
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

    private void traverseInOrder(TreeNode< T> node) {
        if (root == null)
            System.out.println("tree is empty");
        else if (node != null) {
            traverseInOrder(node.left);
            if (count == nextLevel * 2) {
                nextLevel *= 2;
                System.out.println();
            }
            System.out.print(" " + node.data);
            count++;
            traverseInOrder(node.right);
        }
    }


    private void traversePreOrder(TreeNode< T> node) {

        if (root == null) {
            System.out.println("tree is empty");
        }

        if (node != null) {
            if (count == nextLevel * 2) {
                nextLevel *= 2;
                System.out.println();
            }
            System.out.print(" " + node.data);
            count++;
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }

    }


    private void traversePostOrder(TreeNode< T> node) {
        if (root == null)
            System.out.println("tree is empty");
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            if (count == nextLevel * 2) {
                nextLevel *= 2;
                System.out.println();
            }
            System.out.print(" " + node.data);
            count++;
        }
    }

    public int findMaxVal() {
        return findMax(this.root);
    }

    private int findMax(TreeNode node) {
        if (node == null)
            return Integer.MIN_VALUE;

        int result = (int) node.data;
        int lResult = findMax(node.left);
        int rResult = findMax(node.right);

        if (lResult > result)
            result = lResult;
        if (rResult > result)
            result = rResult;
        return result;
    }

}

