package Basics;
import java.util.*;
public class NthFibonacci {
    public static int fibbo(int n) {
        int a = 1;
        int b = 1;
        int sum = 1;
        for(int i = 0; i<n-2; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            System.out.println(n + "th fibonacci number is : " + fibbo(n));
        } finally {
            sc.close();
        }


    }
    
}
