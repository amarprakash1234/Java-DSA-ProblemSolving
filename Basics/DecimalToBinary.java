package Basics;
import java.util.*;
public class DecimalToBinary {
    public static int decimalToBinary(int n) {
        int bin = 0;
        int idx = 0;
        while(n != 0) {
            int rem = n % 2;
            bin += rem * Math.pow(10, idx);
            idx++;
            n /= 2;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the Decimal number : ");
            int n = sc.nextInt();
            System.out.println("Binary number is : " + decimalToBinary(n));
        } finally {
            sc.close();
        }
    }
}
