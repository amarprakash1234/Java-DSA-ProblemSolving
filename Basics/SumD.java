package Basics;
import java.util.*;
public class SumD {
    public static int sumDigit(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            System.out.println("Sum of digits is : " + sumDigit(n));
        } finally {
            sc.close();
        }
        



    }
}
