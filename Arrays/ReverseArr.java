package Arrays;
import java.util.*;
public class ReverseArr {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverseArr(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(j > i) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n;
        int[] arr;
        try {
            n = sc.nextInt();
            arr = new int[n];
            System.out.print("Enter the elements os array : ");
            for(int i = 0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }finally {
            sc.close();
        }
        reverseArr(arr);
        for(int x : arr) {
            System.out.print(x + " ");
        }


    }
}
