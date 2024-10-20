package SortingAndSearching;
import java.util.*;
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
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
            selectionSort(arr);
            System.out.print("Array after sorting is : ");
            printArr(arr);
        } finally {
            sc.close();
        }
    }
}
