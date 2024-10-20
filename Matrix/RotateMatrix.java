package Matrix;
import java.util.*;
public class RotateMatrix {
    public static void reverseRows(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            int j = 0; int k = arr.length-1;
            while(k > j) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++; k--;
            }
        }
    }
    public static void printMatrix(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void makeTranspose(int[][] arr) {
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr.length; j++) {
                if(i > j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }
    public static void rotateMatrix(int[][] arr) {
        makeTranspose(arr);
        reverseRows(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the rows and columns of matrix : ");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            System.out.println("Enter the elements of matrix : ");
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            rotateMatrix(arr);
            printMatrix(arr);
        } finally {
            sc.close();
        }
    }
    
}
