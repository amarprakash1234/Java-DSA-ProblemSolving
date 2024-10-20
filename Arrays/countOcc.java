package Arrays;
import java.util.*;
public class countOcc {
    public static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == x) count++;
        }
        return count;
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
            System.out.println("Ocuurences of x in array is : " + countOccurrences(arr, x));    
        } finally {
            sc.close();
        }


    }
}