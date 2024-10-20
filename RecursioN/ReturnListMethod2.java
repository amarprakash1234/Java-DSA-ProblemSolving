import java.util.*;
public class ReturnListMethod2  {
    public static void helper(int[] arr, int x, ArrayList<Integer> list, int idx) {
        if(idx >= arr.length) return;
        if(arr[idx] == x) {
            list.add(idx);
        }
        helper(arr, x, list, idx+1);
    }
    public static ArrayList<Integer> returnIdx(int[] arr, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(arr, x, list, 0);
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the elements : ");
            for(int i = 0; i < arr.length ; i++) {
                arr[i] = sc.nextInt();
            } 
            System.out.print("Enter x : ");
            int x = sc.nextInt();
            ArrayList<Integer> list = returnIdx(arr, x);
            System.out.println(list);
        } finally {
            sc.close();
        }
    }
}
