package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AppTest {

    //    Can successfully instantiate an empty tree
    @Test
    public void instantiate() {
        BinarySearchTree bst = new BinarySearchTree();
        assertNull(bst.root);
    }

    //    Can successfully instantiate a tree with a single root node
    @Test
    public void oneInstantiate() {
        BinarySearchTree bst = new BinarySearchTree(new Node(5));
        System.out.println(bst.toString());
        String str = "BinarySearchTree{root=5, count=1, nextLevel=1}";
        System.out.println(bst.toString());
        assertEquals(str, bst.toString());
    }

    //    Can successfully add a left child and right child to a single root node
    @Test
    public void addFromRightAndLeft() {
        BinarySearchTree bst = new BinarySearchTree(new Node(5));
        bst.add(4);
        bst.add(6);
        bst.preOrder();
        bst.postOrder();
        bst.inOrder();
    }
//مش عايد كتابة الكود مشان اعدل اخليه يضيف على list بدل ما يطبع
    //    Can successfully return a collection from a preorder traversal
    @Test
    public void preorder() {
        BinarySearchTree bst1 = new BinarySearchTree();
        BinarySearchTree bst2 = new BinarySearchTree(new Node(1));
        bst2.add(7);
        bst2.add(6);
        bst2.add(5);
        bst2.add(4);
        bst2.add(3);
        bst2.add(2);
        bst2.add(1);

        bst1.add(1);
        bst1.add(22);
        bst1.add(33);
        bst1.add(53);
        bst1.add(44);
        bst1.add(94);


        bst2.preOrder();
        bst1.preOrder();
    }
//مش عايد كتابة الكود مشان اعدل اخليه يضيف على list بدل ما يطبع

    //    Can successfully return a collection from an inorder traversal
    @Test
    public void inorder() {
        BinarySearchTree bst1 = new BinarySearchTree();
        BinarySearchTree bst2 = new BinarySearchTree(new Node(1));
        bst2.add(7);
        bst2.add(6);
        bst2.add(5);
        bst2.add(4);
        bst2.add(3);
        bst2.add(2);
        bst2.add(1);

        bst1.add(1);
        bst1.add(22);
        bst1.add(33);
        bst1.add(53);
        bst1.add(44);
        bst1.add(94);

        bst2.inOrder();
        bst1.inOrder();
    }
//مش عايد كتابة الكود مشان اعدل اخليه يضيف على list بدل ما يطبع

    //    Can successfully return a collection from a postorder traversal
    @Test
    public void postorder() {
        BinarySearchTree bst1 = new BinarySearchTree();
        BinarySearchTree bst2 = new BinarySearchTree(new Node(1));
        bst2.add(7);
        bst2.add(6);
        bst2.add(5);
        bst2.add(4);
        bst2.add(3);
        bst2.add(2);
        bst2.add(1);

        bst1.add(1);
        bst1.add(22);
        bst1.add(33);
        bst1.add(53);
        bst1.add(44);
        bst1.add(94);

        bst2.postOrder();
        bst1.postOrder();
    }
}