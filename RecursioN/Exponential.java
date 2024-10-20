import java.util.*;
public class Exponential {
    public static int expo(int p, int q) {
        if(q == 0) return 1;
        int subAns = expo(p, q/2);
        if(q % 2 != 0) {
            return p * subAns * subAns;
        }else {
            return subAns * subAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the Base : ");
            int p = sc.nextInt();
            System.out.print("Enter the power : ");
            int q = sc.nextInt();
            int x = expo(p, q);
            System.out.println("P raised to the power q id : " + x);
        } finally {
            sc.close();
        }

    }
}
