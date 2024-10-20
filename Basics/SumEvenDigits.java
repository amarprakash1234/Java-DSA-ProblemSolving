package Basics;
import java.util.*;
public class SumEvenDigits {
    public static int sumEvenD(int n) {
        int sum = 0;
        while(n != 0) {
            int ld = n % 10;
            if(ld % 2 == 0) {
                sum += ld;
            }
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            System.out.println("Sum of digits is : " + sumEvenD(n));
        } finally {
            sc.close();
        }



    }
}
