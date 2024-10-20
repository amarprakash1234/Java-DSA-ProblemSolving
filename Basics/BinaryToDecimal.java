package Basics;
import java.util.*;
public class BinaryToDecimal {
    public static int binaryToDecimal(int n) {
        int dec = 0;
        int idx = 0;
        while(n != 0) {
            int ld = n % 10;
            dec +=ld * Math.pow(2, idx);
            idx++;
            n /= 10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the binary number : ");
            int n = sc.nextInt();
            System.out.println("Decimal number is : " + binaryToDecimal(n));
        } finally {
            sc.close();
        }
    }
}
