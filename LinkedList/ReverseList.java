package LinkedList;

public class ReverseList {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static void display(Node head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static Node reverseRec(Node head) {
        if(head.next == null) return head;
        Node subAns  = reverseRec(head.next);
        Node temp = subAns;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return subAns;
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
        display(a);
        Node ans = reverseRec(a);
        display(ans);
    }
}
