package Basics;
import java.util.*;
public class Binomial {
    public static int factorial(int n) {
        int x = 1;
        for(int i = 1; i<=n; i++) {
            x *= i;
        }
        return x;
    }
    public static int nCr(int n, int r) {
        return factorial(n)/(factorial(n-r) * factorial(r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter n : ");
            int n = sc.nextInt(); 
            System.out.print("Enter r : ");
            int r = sc.nextInt();
            System.out.println("the value of n combination r is : " + nCr(n, r));
        } finally {
            sc.close();
        }



    }
}
