import java.util.*;
public class FindALLIndices {
    public static void printAI(int[] arr, int x, int i) {
        if(i >= arr.length) return;
        if(arr[i] == x) System.out.print(i + " ");
        printAI(arr, x, i+1);
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
            System.out.print("Enter x : ");
            int x = sc.nextInt();
            printAI(arr, x, 0);
        } finally {
            sc.close();
        }
    }
}
