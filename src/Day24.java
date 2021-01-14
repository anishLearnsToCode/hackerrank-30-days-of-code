public class Day24 {
    public static Node removeDuplicates(Node head) {
        if (head == null) {
            return head;
        }

        Node current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    static class Node {
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
}
