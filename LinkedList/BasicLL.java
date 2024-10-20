package LinkedList;
public class BasicLL {
    public static int lengthLL(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public static void display(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void displayRec(Node head) {
        if(head == null) {
            return;
        }
        System.out.print(head.data + " ");
        displayRec(head.next);
    }
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
        Node(){

        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        a.next = b;
        Node c = new Node(9);
        b.next = c;
        Node d = new Node(8);
        c.next = d;
        Node e = new Node(16);
        d.next = e;
        display(a);
        displayRec(a);
        System.out.println();
        System.out.println("Lenght of linkedList is : " + lengthLL(a));
    }
}