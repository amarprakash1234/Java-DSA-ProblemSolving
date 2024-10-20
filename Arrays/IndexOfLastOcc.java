package Arrays;
import java.util.*;
public class IndexOfLastOcc {
    public static int findIndex(int[] arr, int x) {
        for(int i = arr.length-1; i>=0; i--) {
            if(arr[i] == x) return i;
        }
        return -1;
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
            System.out.print("Enter x : ");
            int x = sc.nextInt();
            System.out.println("Index of last occurance of x is : " + findIndex(arr, x));    
        } finally {
            sc.close();
        }


    }
}
