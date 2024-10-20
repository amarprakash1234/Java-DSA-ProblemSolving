import java.util.*;
public class SumOfDigit {
    public static int sumD(int n) {
        if(n/10 == 0) return n;
        return (n%10) + sumD(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the Number : ");
            int n = sc.nextInt();
            int x = sumD(n);
            System.out.println("Sum of Digit is : " + x);
        } finally {
            sc.close();
        }


    }
}
