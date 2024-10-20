package Arrays;
import java.util.*;
public class CheckIssorted {
    public static boolean isSorted(int[] arr) {
        for(int i = 0; i<arr.length-1; i++) {
            if(arr[i+1] < arr[i]) return false;
        }
        return true;
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
            System.out.print("Array is Sorted : ");
            if(isSorted(arr)) System.out.println("Yes");
            else System.out.println("No");
        } finally {
            sc.close();
        }




    }
}
