package Arrays;
import java.util.*;
public class FindUnique {
    public static int findUnique(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    arr[i] = arr[j] = Integer.MIN_VALUE;
                }
            }
        }
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] != Integer.MIN_VALUE) return arr[i];
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
            System.out.println("the unique element in array is : " + findUnique(arr));    
        } finally {
            sc.close();
        }


    }
}
