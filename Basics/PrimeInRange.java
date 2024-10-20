package Basics;
import java.util.*;
public class PrimeInRange {
    public static boolean checkPrime(int n) {
        for(int i = 2; i <= n-1; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> primeIR(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i<=n; i++) {
            if(checkPrime(i)) list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter n : ");
            int n = sc.nextInt();
            ArrayList<Integer> list = primeIR(n);
            System.out.println("Prime number in Range n is : " + list);
        } finally {
            sc.close();
        }

    }
    
}
