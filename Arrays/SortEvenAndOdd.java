package Arrays;
import java.util.*;
public class SortEvenAndOdd {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sortEAO(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(j > i) {
            if(arr[i]%2 != 0  &&  arr[j]%2 == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if(arr[i]%2 == 0) i++;
            if(arr[j]%2 != 0) j--;
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
            sortEAO(arr);
            System.out.print("Array after sorting in even and odd is : ");
            for(int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        } finally {
            sc.close();
        }
    }
}
