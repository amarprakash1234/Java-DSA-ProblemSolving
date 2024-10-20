package Matrix;
import java.util.*;
public class MatrixMultiplication {
    public static int[][] matrixProduct(int[][] arr, int[][] brr) {
        int[][] ans = new int[arr.length][brr[0].length];
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<brr[0].length; j++) {
                int temp = 0;
                for(int k = 0; k<brr.length; k++) {
                    temp += arr[i][k] * brr[k][j];
                }
                ans[i][j] = temp;
            }
        }
        return ans;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the rows and columns of first matrix : ");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            System.out.println("Enter the elements of first matrix : ");
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.print("Enter the rows and columns of second matrix : ");
            int p = sc.nextInt();
            int q = sc.nextInt();
            int[][] brr = new int[p][q];
            System.out.println("Enter the elements of second matrix : ");
            for(int i = 0; i < p; i++) {
                for(int j = 0; j < q; j++) {
                    brr[i][j] = sc.nextInt();
                }
            }
            int [][] ans = matrixProduct(arr, brr);
            for(int i = 0; i<ans.length; i++) {
                for(int j = 0; j<ans[0].length; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        } finally {
            sc.close();
        }
    }
}