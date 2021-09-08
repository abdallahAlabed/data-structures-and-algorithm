package HashTable;

public class TreeNode< T> {
    public T data;
    public TreeNode left;
    public TreeNode right;


    public TreeNode( T data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public TreeNode( T data) {

        this.data = data;
    }

    public TreeNode() {
    }
}
