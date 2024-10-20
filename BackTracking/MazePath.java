package BackTracking;
import java.util.*;
public class MazePath {
    public static int mazePath2Direction(int sr, int sc, int er, int ec) {
        if(sr==er && sc==ec) return 1;
        if(sr > er) return 0;
        if(sc > ec) return 0;
        return mazePath2Direction(sr+1, sc, er, ec) + mazePath2Direction(sr, sc+1, er, ec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the row of grid : ");
            int n = sc.nextInt();
            System.out.print("Enter the column of grid : ");
            int m = sc.nextInt();
            System.out.println("Number of ways is : " + mazePath2Direction(1, 1, n, m));
        } finally {
            sc.close();
        }




    }
}
