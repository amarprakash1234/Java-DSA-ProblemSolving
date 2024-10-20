package Stacks;
import java.util.*;
public class BasicStack {
    public static void insertAtBottom(Stack<Integer> st, int x) {
        if(st.size() == 0) {
            st.push(x);
            return;
        }
        int y = st.pop();
        insertAtBottom(st, x);
        st.push(y);
    }
    public static void reverseRec(Stack<Integer> st) {
        if(st.size() == 0) {
            return;
        }
        int x = st.pop();
        reverseRec(st);
        insertAtBottom(st, x);
    }
    public static void deleteRec(Stack<Integer> st, int idx) {
        if(st.size() == (idx + 1)) {
            st.pop();
            return;
        }
        int x = st.pop();
        deleteRec(st, idx);
        st.push(x);
    }
    public static void displayRec(Stack<Integer> st) {
        if(st.size() == 0) return;
        int x = st.pop();
        displayRec(st);
        System.out.print(x + " ");
        st.push(x);
    } 
    public static void insertAtidx(Stack<Integer> st, int idx, int x) {
        if(st.size() == idx) {
            st.push(x);
            return;
        }
        int y = st.pop();
        insertAtidx(st, idx, x);
        st.push(y);
    }
    public static int getFirstElement(Stack<Integer> st) {
        Stack<Integer> gt = new Stack<>();
        while(st.size() > 1) {
            gt.push(st.pop());
        }
        int x = st.peek();
        while(gt.size() > 0) {
            st.push(gt.pop());
        }
        return x;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1); st.push(2); st.push(3); st.push(4); st.push(5);
        reverseRec(st);
        System.out.println(st);
    } 
}
