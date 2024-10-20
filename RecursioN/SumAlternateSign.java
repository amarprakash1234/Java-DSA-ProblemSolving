// Given a number n. Find the sum of natural numbers till n but with alternate signs.

import java.util.*;
public class SumAlternateSign {
    public static int sumAlt(int n) {
        if(n == 0) return 0;
        if(n%2 != 0) {
            return sumAlt(n-1) + n;
        }else {
            return sumAlt(n-1) - n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            int x = sumAlt(n);
            System.out.println("Sum of n number with alternate sign is : " + x);
        } finally {
            sc.close();
        }
        

    }
}
