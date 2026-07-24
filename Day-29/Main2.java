import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, ArrayList<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}

public class Main2 {

    public static Node cloneGraph(Node node) {

        if (node == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();

        return dfs(node, map);
    }

    public static Node dfs(Node node, HashMap<Node, Node> map) {

        // If already cloned
        if (map.containsKey(node))
            return map.get(node);

        // Create clone
        Node clone = new Node(node.val);

        map.put(node, clone);

        // Clone neighbors
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(dfs(neighbor, map));
        }

        return clone;
    }

    public static void main(String[] args) {

        // Creating graph:
        // 1 -- 2
        // |    |
        // 4 -- 3

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.neighbors.add(n2);
        n1.neighbors.add(n4);

        n2.neighbors.add(n1);
        n2.neighbors.add(n3);

        n3.neighbors.add(n2);
        n3.neighbors.add(n4);

        n4.neighbors.add(n1);
        n4.neighbors.add(n3);

        Node cloned = cloneGraph(n1);

        System.out.println("Cloned node value: " + cloned.val);
        System.out.println("Neighbors:");

        for (Node n : cloned.neighbors) {
            System.out.print(n.val + " ");
        }
    }
}