import java.util.LinkedList;
import java.util.Queue;

public class Day23 {
    static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current == null) {
                continue;
            }
            System.out.print(current.data + " ");
            queue.add(current.left);
            queue.add(current.right);
        }
    }

    static class Node {
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
}
