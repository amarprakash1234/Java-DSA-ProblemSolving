package BackTracking;
import java.util.*;
public class PrintPath {
    public static void printPath(int sr, int sc, int er, int ec, String path) {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec) {
            System.out.println(path);
            return;
        }
        printPath(sr+1, sc, er, ec, path+"D"); 
        printPath(sr, sc+1, er, ec, path + "R");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the row of grid : ");
            int n = sc.nextInt();
            System.out.print("Enter the column of grid : ");
            int m = sc.nextInt();
            printPath(1, 1, n, m, "");
        } finally {
            sc.close();
        }
    }
}
