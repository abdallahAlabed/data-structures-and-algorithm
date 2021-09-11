package HashTable;

import java.util.ArrayList;
import java.util.Arrays;


public class HashTable<S, T> {

    public LinkedList[] hashTable = new LinkedList[10];

    public int hash(S key) {
        int sum = 0;
        char[] charArr = key.toString().toCharArray();
        for (int oneChar : charArr) {
//            System.out.println(oneChar);
            sum += oneChar;
        }
        return sum % hashTable.length;
    }

    public void add(S key, T data) {
        int index = hash(key);
//        hashTable[index].addLinkedlist((S)key,(T)data);
        Node<S, T> nodeToAdd = new Node<S, T>((S)key, data);
        if (hashTable[index] != null) {
            hashTable[index].head.next= nodeToAdd;
            hashTable[index].tail= nodeToAdd;
        } else {
            hashTable[index] = new LinkedList();
            hashTable[index].head = nodeToAdd;
            hashTable[index].tail = nodeToAdd;

        }
    }

    public T get(S key) {
        int index = hash(key);

        if (hashTable[index] == null) {
            return null;
        } else if (key == hashTable[index].head.key) {
            return (T) hashTable[index].head.data;
        } else {
            Node<S, T> current = hashTable[index].head;
            while (current != null) {
                if (key.equals(current.key))
                    return current.data;
                current = current.next;
            }
            return null;
        }
    }

    public boolean contains(S key) {
        int index = hash(key);

        if (hashTable[index] == null) {
            return false;
        } else if (key.equals(hashTable[index].head.key) ) {
            return true;
        } else {
            Node<S, T> current = hashTable[index].head;
            while (current != null) {
                System.out.println(current.key);
                System.out.println(key);
                if (key.equals(current.key) )
                    return true;
                current = current.next;
            }
            return false;
        }
    }

    public S printOneBucket(S key) {
        int index = hash(key);

        if (hashTable[index] == null) {
            return null;
        } else
            return (S) hashTable[index].toString();
    }

    public String repeatedWord(String str) {

        String[] str1 = str.toLowerCase().replace(",", "").split(" ");
        for (String word : str1) {
            if (this.contains((S) word)) {
                return word;
            } else {
                this.add((S) word, (T) word);
            }
        }
        return "";
    }
    public ArrayList treeIntersection(BinaryTree tree1, BinaryTree tree2) {

        if (tree1.root == null || tree2.root == null)
            return null;
        ArrayList<Object> arr = new ArrayList<>();

        for (Object oneItem : tree1.preOrder(tree1.root)) {
            this.add((S)oneItem.toString(), null);
        }

        for (Object oneItem: tree2.preOrder(tree2.root)) {
            if (this.contains((S)oneItem.toString()) && !arr.contains(oneItem)) arr.add(oneItem);
        }

        return arr;
    }
    public ArrayList  leftJoin(HashTable one ,HashTable two){
        ArrayList finalResult = new ArrayList<>();
        for(int x=0; x<10; x++){
            if ((S)one.hashTable[x] != null && two.contains((S)one.hashTable[x].head.key)){
                one.hashTable[x].tail.next = two.hashTable[x].head;
                finalResult.add((S)one.hashTable[x]);
            }
            else{
                finalResult.add((S)one.hashTable[x]);
            }
        }
        return finalResult;
    }
    @Override
    public String toString() {
        return "HashTable{" +
                "hashTable=" + Arrays.toString(hashTable) +
                '}';
    }
}