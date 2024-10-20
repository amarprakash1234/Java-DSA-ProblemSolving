package Basics;
import java.util.*;
public class CheckPrime {
    public static boolean checkPrime(int n) {
        for(int i = 2; i <= n-1; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            System.out.println("the number is prime : " + checkPrime(n));
        } finally {
            sc.close();
        }



    }
}
