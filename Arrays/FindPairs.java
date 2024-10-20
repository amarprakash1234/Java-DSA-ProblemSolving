package Arrays;
import java.util.*;
public class FindPairs {
    public static int countPairs(int[] arr, int x) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == x) {
                    System.out.print("(" + arr[i] + "," + arr[j] + ")");
                    count++;
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
            System.out.println("Total number of pairs whose sun is x is : " + countPairs(arr, x));
        } finally {
            sc.close();
        }
        


    
    }
}
