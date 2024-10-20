import java.util.*;
public class CountOfDigit {
    public static int countD(int n) {
        if(n == 0) return 0;
        return 1 + countD(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int x = countD(n);
        System.out.println("Count of Digit of " + n + " is : " + x);
        } finally {
            sc.close();
        }

    }
}
