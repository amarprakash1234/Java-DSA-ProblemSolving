package Stacks;
public class ArrayImplementation {
    public static class Stacks {
        int[] arr = new int[5];
        int idx = 0;
        void push(int val) {
            if(idx == arr.length) {
                System.out.println("Stack is full!!!");
                return;
            }
            arr[idx] = val;
            idx++;
        }
        int peek() {
            if(idx == 0) {
                System.out.println("Stack is emplty!!");
                return -1;
            }
            return arr[idx-1];
        }
        int pop() {
            if(idx == 0) {
                System.out.println("Stack is emplty!!");
                return -1;
            }
            int x = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return x;
        }
        int size() {
            return idx;
        }
        boolean isEmpty() {
            if(idx == 0) return true;
            else return false;
        }
        boolean isFull() {
            if(idx == arr.length) return true;
            else return false;
        }
        void display() {
            for(int i = 0; i<idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int capacity() {
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stacks st = new Stacks();
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
