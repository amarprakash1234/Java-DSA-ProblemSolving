package Matrix;
import java.util.*;
public class spiralPrint {
    public static void printSpiral(int[][] arr) {
        int n = arr.length; int m = arr[0].length;
        int x = 1;
        int sr = 0, er = arr.length-1, sc = 0, ec = arr[0].length-1;
        while(x <= (n * m) ) {
            for(int j = sc; j <= ec; j++) {
                if(x <= (n * m)) {
                    System.out.print(arr[sr][j] + " ");
                    x++;
                }
            }
            sr++;
            for(int i = sr; i<= er; i++) {
                if(x <= (n * m)) {
                    System.out.print(arr[i][ec] + " ");
                    x++;
                }
            }
            ec--;
            for(int j = ec; j >= sc; j--) {
                if(x <= (n * m)) {
                    System.out.print(arr[er][j] + " ");
                    x++;
                }
            }
            er--;
            for(int i = er; i >= sr; i--) {
                if(x <= (n * m)) {
                    System.out.print(arr[i][sc] + " ");
                    x++;
                }
            }
            sc++;
        }
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
            printSpiral(arr);
        } finally {
            sc.close();
        }
    }
}
