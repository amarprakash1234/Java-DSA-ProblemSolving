package LinkedList;

public class NthNodeFromEnd {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static Node findNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for(int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static Node findNode(Node a, int n) {
        Node temp = a;
        int count = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        for(int i = 0; i < (count-n); i++) {
            a = a.next;
        }
        return a;

    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node ans = findNode2(a, 6);
        System.out.println(ans.data);
    }
}
