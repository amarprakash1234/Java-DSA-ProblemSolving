package Basics;
import java.util.*;
public class ReverseNum {
    public static int reverseNum(int n) {
        int rN = 0;
        while(n != 0) {
            rN *= 10;
            rN += n % 10;
            n /= 10;
        }
        return rN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            System.out.println("Sum of digits is : " + reverseNum(n));
        } finally {
            sc.close();
        }



    }
}
