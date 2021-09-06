package HashTable;

import java.util.Arrays;


public class HashTable<String, T> {

    public LinkedList[] hashTable = new LinkedList[10];

    public int hash(String key) {
        int sum = 0;
        char[] charArr = key.toString().toCharArray();
        for (int oneChar : charArr) {
//            System.out.println(oneChar);
            sum += oneChar;
        }
        return sum % hashTable.length;
    }

    public void add(String key, T data) {
        int index = hash(key);

        Node<String, T> nodeToAdd = new Node<String, T>(key, data);

        if (hashTable[index] != null) {
            nodeToAdd.next = hashTable[index].head;
        } else {
            hashTable[index] = new LinkedList();
            hashTable[index].head = nodeToAdd;
        }

    }

    public T get(String key) {
        int index = hash(key);

        if (hashTable[index] == null) {
            return null;
        } else if (key == hashTable[index].head.key) {
            return (T) hashTable[index].head.data;
        } else {
            Node<String, T> current = hashTable[index].head;
            while (current != null) {
                if (key == current.key)
                    return current.data;
                current = current.next;
            }
            return null;
        }
    }

    public boolean contains(String key) {
        int index = hash(key);

        if (hashTable[index] == null) {
            return false;
        } else if (key == hashTable[index].head.key) {
            return true;
        } else {
            Node<String, T> current = hashTable[index].head;
            while (current != null) {
                if (key == current.key)
                    return true;
                current = current.next;
            }
            return false;
        }

    }

    public String printOneBucket(String key) {
        int index = hash(key);

        if (hashTable[index] == null) {
            return null;
        } else
            return (String) hashTable[index].toString();
    }

    public java.lang.String repeatedWord(java.lang.String str) {
        str = str.toLowerCase();
        str = str.replace(",", "");
        java.lang.String[] str1 = str.split(" ");

        for (java.lang.String word : str1) {
            word = word;
//            System.out.println(word);
//            System.out.println(this);
//            System.out.println(hash((String)word));
//            System.out.println(this.contains((String) word));
            if (this.contains((String) word)) {
                System.out.println(this.contains((String) word));
                return word;
            } else{
                System.out.println(this);
                this.add((String) word, (T) word);
            }


        }
        return "";
    }

    @Override
    public java.lang.String toString() {
        return "HashTable{" +
                "hashTable=" + Arrays.toString(hashTable) +
                '}';
    }
}