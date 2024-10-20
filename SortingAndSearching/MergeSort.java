package SortingAndSearching;
import java.util.*;
public class MergeSort {
    public static void merge(int[] arr, int st, int mid, int end) {
        int[] left = new int[mid-st+1];
        int[] right = new int[end-mid];
        int k = st;
        for(int i = 0; i<left.length; i++) {
            left[i] = arr[k++];
        }
        for(int i = 0; i<right.length; i++) {
            right[i] = arr[k++];
        }
        int i = 0, j = 0;
        k = st;
        while(i<left.length && j<right.length) {
            if(left[i] <= right[j]){
                arr[k++] = left[i++]; 
            } else {
                arr[k++] = right[j++];
            }
        }
        while(i<left.length) {
            arr[k++] = left[i++];
        }
        while(j<right.length) {
            arr[k++] = right[j++];
        }
    }
    public static void mergeSort(int[] arr, int st, int end) {
        if(st >= end) return;
        int mid = (st+end)/2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, st, mid, end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of array : ");
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            mergeSort(arr, 0, arr.length-1);
            for(var i : arr) {
                System.out.print(i + " ");
            }
        } finally {
            sc.close();
        }
    }
}
