package Arrays;
import java.util.*;
public class FindTriplets {
    public static int countTriplets(int[] arr, int x) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                for(int k = j+1; k<arr.length; k++) {
                    if(arr[i] + arr[j] + arr[k] == x) {
                        count++;
                        System.out.print("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
                    }
                }
            }
        }
        System.out.println();
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
            System.out.println("Total number of pairs whose sun is x is : " + countTriplets(arr, x));    
        } finally {
            sc.close();
        }


    }
}
