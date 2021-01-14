public class Day22 {
    public static int getHeight(Node root) {
        return height(root) - 1;
    }

    private static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
}
