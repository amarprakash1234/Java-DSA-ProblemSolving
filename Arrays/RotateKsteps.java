package Arrays;
import java.util.*;
public class RotateKsteps {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverseArr(int[] arr, int i, int j) {
        while(j > i) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public static void rotateKS(int[] arr, int k) {
        k %= arr.length;
        reverseArr(arr, 0, arr.length-1);
        reverseArr(arr, 0, k-1);
        reverseArr(arr, k, arr.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n;
        int[] arr;
        int k;
        try {
            n = sc.nextInt();
            arr = new int[n];
            System.out.print("Enter the elements os array : ");
            for(int i = 0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter K : ");
            k = sc.nextInt();
        }finally {
            sc.close();
        }
        rotateKS(arr, k);
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();


    }
}
