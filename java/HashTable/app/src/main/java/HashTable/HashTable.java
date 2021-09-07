package HashTable;

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
        } else {
            hashTable[index] = new LinkedList();
            hashTable[index].head = nodeToAdd;
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
//            System.out.println(word);
//            System.out.println(this);
//            System.out.println(hash((String)word));
//            System.out.println(this.contains((S)word));
            if (this.contains((S) word)) {
//                System.out.println(this.contains((S) word));
                return word;
            } else {
//                System.out.println(this);
                this.add((S) word, (T) word);
            }
        }
        return "";
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "hashTable=" + Arrays.toString(hashTable) +
                '}';
    }
}