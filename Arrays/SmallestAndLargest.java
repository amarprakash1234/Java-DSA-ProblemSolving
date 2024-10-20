package Arrays;
import java.util.*;
public class SmallestAndLargest {
    public static int findSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
    public static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static int[] findSAL(int[] arr) {
        int[] ans = new int[2];
        int s = findSmallest(arr);
        int l = findLargest(arr);
        ans[0] = s;
        ans[1] = l;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            System.out.print("Enter the elements : ");
            int[] arr = new int[n];
            for(int i = 0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] ans = findSAL(arr);
            for(int x : ans) {
                System.out.print(x + " ");
            }
        } finally {
            sc.close();
        }



    }
}
