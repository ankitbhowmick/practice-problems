package dataStructures.tree;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public void inOrder(TreeNode root) {
        // left, root, right
        if (root == null) {
            return;
        }

        inOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrder(root.getRight());
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData() + " ");
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getData() + " ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.setLeft(new TreeNode(1));
        root.setRight(new TreeNode(2));

        root.getLeft().setLeft(new TreeNode(3));
        root.getLeft().setRight(new TreeNode(4));

        BinaryTree binaryTree = new BinaryTree(root);

        System.out.println("In-Order Traversal");
        binaryTree.inOrder(root);
        System.out.println();

        System.out.println("Post-Order Traversal");
        binaryTree.postOrder(root);
        System.out.println();

        System.out.println("Pre-Order Traversal");
        binaryTree.preOrder(root);
        System.out.println();

    }
}

class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}