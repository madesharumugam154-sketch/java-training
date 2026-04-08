import java.util.ArrayList;
import java.util.List;

public class Problem5 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        path(root, "", result);
        return result;
    }

    public static void path(TreeNode node, String current, List<String> result) {

        if (node == null) {
            return;
        }

        current += node.val;

        if (node.left == null && node.right == null) {
            result.add(current);
            return;
        }

        current += "->";

        path(node.left, current, result);
        path(node.right, current, result);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> result = binaryTreePaths(root);

        System.out.println(result);
    }
}