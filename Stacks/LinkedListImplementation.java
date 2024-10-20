package Stacks;

public class LinkedListImplementation {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class Stacks2 {
        Node head = null;
        int size = 0;
        void push(int x) {
            Node temp = new Node(x);
            if(size == 0) {
                head = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        int peek() {
            if(size == 0) {
                System.out.println("Stack is empty!!");
                return -1;
            }
            return head.val;
        }
        int pop() {
            if(size == 0) {
                System.out.println("Stack is empty!!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        void displayRec(Node temp) {
            if(temp == null) return;
            displayRec(temp.next);
            System.out.print(temp.val + " ");
        }
        void display() {
            displayRec(head);
        }
        int size() {
            return size;
        }
        boolean isEmpty() {
            if(size == 0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stacks2 st = new Stacks2();
        st.push(1); st.push(2); st.push(3); st.push(4); st.push(5);
        st.display();
        System.out.println();
        System.out.println(st.size());
        System.out.println(st.peek());
        st.pop();
        st.pop();
        st.display();
        System.out.println();
        System.out.println(st.size());
    }
}
