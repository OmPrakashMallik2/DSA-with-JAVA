class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree3 {

    Node root;

    BinaryTree3() {
        root = null;
    }

    // print preorder of a binary tree
    static void printPreorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree3 tree = new BinaryTree3();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        printPreorder(tree.root);
    }
}
