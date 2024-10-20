import java.util.*;
public class SubsetSum {
    public static void subsetSum(int[] arr, int sum, int idx) {
        if(idx >= arr.length) {
            System.out.println(sum);
            return;
        }
        subsetSum(arr, sum + arr[idx], idx+1);
        subsetSum(arr, sum, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the size of array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elementa of Array : ");
            for(int i = 0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            subsetSum(arr, 0, 0);
        } finally {
            sc.close();
        }



    }
}
