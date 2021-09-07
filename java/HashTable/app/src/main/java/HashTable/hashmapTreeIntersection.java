package HashTable;

public class hashmapTreeIntersection<S, T>  {
    public LinkedList[] hashTable = new LinkedList[10];

    public int hash(S key) {
        int sum = 0;
        char[] charArr = key.toString().toCharArray();
        for (int oneChar : charArr) {
            sum += oneChar;
        }
        return sum % hashTable.length;
    }

    public void add(S key, T data) {
        int index = hash(key);

        Node<S, T> nodeToAdd = new Node<S, T>((String) key, data);


        if (hashTable[index] != null) {
            nodeToAdd.next = hashTable[index].head;
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
                if (key == current.key)
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
        } else if (key == hashTable[index].head.key) {
            return true;
        } else {
            Node<S, T> current = hashTable[index].head;
            while (current != null) {
                if (key == current.key)
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

}
