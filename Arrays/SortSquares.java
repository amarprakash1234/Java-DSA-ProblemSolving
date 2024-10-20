package Arrays;
import java.util.*;
public class SortSquares {
    public static int[] sortSquares(int[] arr) {
        int[] ans = new int[arr.length];
        int i = 0, j = arr.length-1, k = arr.length-1;
        while(j >= i) {
            if(Math.abs(arr[j]) > Math.abs(arr[i])) {
                ans[k--] = arr[j] * arr[j];
                j--;
            }else {
                ans[k--] = arr[i] * arr[i];
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of array : ");
            for(int i = 0; i < arr.length; i ++) {
                arr[i] = sc.nextInt();
            }
            int[] ans = sortSquares(arr);
            System.out.print("Array of squares sorted in incresing order is : ");
            for(int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        } finally {
            sc.close();
        }



    }
}
