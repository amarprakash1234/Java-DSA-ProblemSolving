package Arrays;
import java.util.*;
public class MakePrefixSumArr {
    public static void makePrefixArr(int[] arr) {
        for(int i = 1; i<arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
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
            makePrefixArr(arr);
            for(int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        } finally {
            sc.close();
        }



    }
}
