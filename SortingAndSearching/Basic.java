package SortingAndSearching;
import java.util.*;
public class Basic{
    static int binarySearch(int[] arr, int x, int i, int j) {
        if(i >= j) {
            if(arr.length != 0) {
                if(arr[i] == x) return i;
                else return -1;
            }
            else return -1;
        }
        int mid = (i + j)/2;
        if(x == arr[mid]) {
            return mid;
        }
        if(x < arr[mid]) {
            return binarySearch(arr, x, i, mid-1);
        } else {
            return binarySearch(arr, x, mid+1, j);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
            System.out.print("Enter the size : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the elemens of array : ");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter target : ");
            int x = sc.nextInt();
            System.out.println("Index of our target is : " + binarySearch(arr, x, 0, n-1));
            
        } finally {
            sc.close();
        }
		
		
		
	}
}
