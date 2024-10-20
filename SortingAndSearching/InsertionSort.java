package SortingAndSearching;
import java.util.*;
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int j = i;
            while(j >= 1  &&  arr[j-1] > arr[j]) {
                swap(arr, j, j-1);
                j--;
            }
        }
    }
    public static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static void printArr(int[] arr) {
        for(var i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of array : ");
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            insertionSort(arr);
            System.out.print("Array after sorting is : ");
            printArr(arr);
        } finally {
            sc.close();
        }




    }
}
