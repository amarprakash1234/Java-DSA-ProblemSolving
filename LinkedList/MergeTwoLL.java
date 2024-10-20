package LinkedList;

public class MergeTwoLL {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static Node mergeList(Node head1, Node head2) {
        Node head = new Node(100);
        Node temp1 = head;
        while(head1 != null  &&  head2 != null) {
            if(head1.data > head2.data) {
                Node temp = new Node(head2.data);
                head.next = temp;
                head = head.next;
                head2 = head2.next;
            } else {
                Node temp = new Node(head1.data);
                head.next = temp;
                head = head.next;
                head1 = head1.next;
            }
        }
        if(head1 == null) {
            head.next = head2;
        }
        if(head2 == null) {
            head.next = head1;
        }
        return temp1.next;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node g = new Node(2);
        Node h = new Node(4);
        Node i = new Node(6);
        Node j = new Node(8);
        g.next = h;
        h.next = i;
        i.next = j;
        Node ans = mergeList(a, g);
        while(ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }
}
