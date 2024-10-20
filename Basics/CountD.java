package Basics;
import java.util.*;
public class CountD {
    public static int countD(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            System.out.println("Number of digit in given number is : " + countD(n));
        }finally {
            sc.close();
        }



   } 
}
