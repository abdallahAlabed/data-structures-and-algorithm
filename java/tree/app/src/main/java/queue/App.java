package queue;

public class App {
    public static void main(String[] args) throws Exception {

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

//        bst2.inOrder();
//        bst2.preOrder();
//        bst2.postOrder();
//
//        bst1.inOrder();
//        bst1.postOrder();
//        bst1.preOrder();

    }
}