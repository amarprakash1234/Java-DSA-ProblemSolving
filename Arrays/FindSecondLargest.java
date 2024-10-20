package Arrays;
import java.util.*;
public class FindSecondLargest {
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static int findSmax(int[] arr) {
        int max = findMax(arr);
        int smax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > smax && arr[i] != max) smax = arr[i];
        }
        return smax;
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
            System.out.println("Second largest element in array is : " + findSmax(arr));    
        } finally {
            sc.close();
        }
    }
}
