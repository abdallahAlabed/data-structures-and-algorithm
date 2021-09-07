package HashTable;

public class TreeNode<S, T> {
    public S key;
    public T data;
    public TreeNode left;
    public TreeNode right;


    public TreeNode(S key, T data, TreeNode left, TreeNode right) {
        this.key = key;
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public TreeNode(S key, T data) {
        this.key = key;
        this.data = data;
    }
}
