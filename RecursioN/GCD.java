import java.util.*;
public class GCD {
    // Recursive (Euclid's Algorithm)
    static int hcf3(int x, int y) {
        if(y == 0) return x;
        return hcf3(y, x%y);
    }
    // Iterative
    static int hcf2(int x, int y) {
        while(x % y != 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }
        return y;
    }
    // Iterative
    public static int hcf(int x, int y) {
        int gcd = 1;
        for(int i = Math.min(x, y); i>=1; i--) {
            if(x%i == 0 && y%i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter x : ");
            int x = sc.nextInt();
            System.out.print("Enter Y : ");
            int y = sc.nextInt();
            int gcd = hcf3(x, y);
            System.out.println("GCD of x and y is : " + gcd);
        } finally {
            sc.close();
        }

    }
}
