package SortingAndSearching;
import java.util.*;
public class BubbleSort {
    public static void printArr(int[] arr) {
        for(var i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length-1; i++) {
            boolean flag = true;
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    flag = false;
                }
            }
            if(flag == true) return;
        }
    }
    public static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
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
            bubbleSort(arr);
            System.out.print("Array after sorting is : ");
            printArr(arr);
        } finally {
            sc.close();
        }





    }
}
