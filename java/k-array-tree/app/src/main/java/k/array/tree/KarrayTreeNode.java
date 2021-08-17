package k.array.tree;

import java.util.ArrayList;
import java.util.List;

public class KarrayTreeNode {
    Integer value;
    KarrayTreeNode children[];
    KarrayTreeNode(Integer n, Integer value) {
        children = new KarrayTreeNode[n];
        this.value = value;
    }

    static void inorder(KarrayTreeNode node) {
        if (node == null)
            return;
        int siz = node.children.length;
        for (int i = 0; i < siz - 1; i++)
            inorder(node.children[i]);
        System.out.print("" + node.value + " ");
        inorder(node.children[siz - 1]);
    }

     static List<String> list = new ArrayList<>();
    public static List<String> FizzBuzz(KarrayTreeNode node) {
        if (node == null) {
            return list;
        }
        int siz = node.children.length;
        for (int i = 0; i < siz - 1; i++){
            FizzBuzz(node.children[i]);
        }

        if (node.value % 3 == 0 && node.value % 5 == 0){
            list.add("FizzBuzz");
        }else if (node.value % 3 == 0){
            list.add("Fizz");
        }
        else if (node.value % 5 == 0){
            list.add("Buzz");
        }else {
            String str = Integer.toString(node.value);
            list.add(str);
        }
        FizzBuzz(node.children[siz- 1]);
        return list;
    }
}

