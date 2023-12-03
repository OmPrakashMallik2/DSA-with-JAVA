class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int data) {
        this.data = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class LevelOrderTraversal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> LevelOrderT(TreeNode root) {
        Queue<TreeNode> queue = new Queue<>();

        List<List<Integer>> wraplist = new ArrayLists<>();
    }
}
