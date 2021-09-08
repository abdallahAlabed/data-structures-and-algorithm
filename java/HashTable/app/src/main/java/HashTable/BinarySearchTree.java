package HashTable;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<S,T> extends BinaryTree<T> {
//
//    public BinarySearchTree() {
//        super();
//
//    }
//
//    public BinarySearchTree(TreeNode<S,T>root) {
//        super(root);
//    }
//
//    public void add(T value, S key) {
//        root = this.addRecursive(this.root, value,key);
//    }
//    public boolean contains(S key) {
//
//        return this.containsNodeRecursive(this.root, key);
//    }
//    public TreeNode<S,T> getValFoNod(S key) {
//
//        return this.getNodeRecursive(this.root, key);
//    }
//
//    @Override
//    public String toString() {
//        return "BinarySearchTree{" +
//                "root=" + root.data +
//                ", count=" + count +
//                ", nextLevel=" + nextLevel +
//                '}';
//    }
//
//    private TreeNode<S,T>addRecursive(TreeNode<S,T> current, T value,S key) {
//        if (current == null) {
//            return new TreeNode(key,value);
//
//        }
//        if ((Integer) key < (Integer) current.key) {
//            current.left = addRecursive(current.left, value,key);
////            System.out.println(current.left.value);
//        } else if ((Integer) key > (Integer) current.key) {
//            current.right = addRecursive(current.right, value,key);
////            System.out.println(current.right.value);
//        } else {
//            System.out.println("you cant add the same number ");
//            return current;
//        }
//        return current;
//    }
//
//    public boolean containsNodeRecursive(TreeNode<S,T> current, S key) {
//        if (current == null) {
//            return false;
//        }
//        if (key == current.key ) {
//            return true;
//        }
//        if ((Integer) key < (Integer) current.key) {
//            containsNodeRecursive(current.left, key);
//        } else {
//            containsNodeRecursive(current.right, key);
//        }
//        return false;
//    }
//
//    public TreeNode<S,T>  getNodeRecursive(TreeNode<S,T> current, S key) {
//        if (current == null) {
//            return null;
//        }
//        if (key == current.key ) {
//            return current;
//        }
//        if ((Integer) key < (Integer) current.key) {
//            containsNodeRecursive(current.left, key);
//        } else {
//            containsNodeRecursive(current.right, key);
//        }
//        return null;
//    }

}