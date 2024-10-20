package LinkedList;

public class Implementation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if(size == 0) {
                head = tail = temp;
                size++;
            }else {
                tail.next = temp;
                tail = temp;
                size++;
            }
        }
        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int length() {
            return size;
        }
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if(size == 0) {
                head = tail = temp;
                size++;
            }else {
                temp.next = head;
                head = temp;
                size++;
            }
        }
        void insertAt(int idx, int val) {
            if(idx == 0) {
                insertAtHead(val);
                return;
            }else if(idx == (size-1)) {
                insertAtEnd(val);
                return;
            }else {
                Node temp = new Node(val);
                Node temp2 = head;
                for(int i = 0; i<idx-1; i++) {
                    temp2 = temp2.next;
                }
                temp.next = temp2.next;
                temp2.next = temp;
                size++;
            }
        }
        int getAt(int idx) {
            Node temp = head;
            for(int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx) {
            if(idx == 0) {
                head = head.next;
            } else if(idx == (size-1)) {
                Node temp = head;
                for(int i = 0; i < idx-1; i++) {
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
            } else {
                Node temp = head;
                for(int i = 0; i < idx-1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            size--;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(13);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(12);
        ll.insertAtEnd(10);
        ll.insertAt(0, 100);
        ll.display();
        System.out.println(ll.getAt(3));
        ll.deleteAt(5);
        ll.deleteAt(0);
        ll.deleteAt(2);
        ll.display();
    }
}
