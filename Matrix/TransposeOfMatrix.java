package Matrix;
import java.util.*;
public class TransposeOfMatrix {
    public static void printMatrix(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transposeOfMatrix(int[][] arr) {
        int[][] ans = new int[arr[0].length][arr.length];
        for(int i = 0; i<ans.length; i++) {
            for(int j = 0; j<ans[0].length; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
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
            int[][] ans = transposeOfMatrix(arr);
            printMatrix(ans);

        } finally {
            sc.close();
        }


        
    }
}
