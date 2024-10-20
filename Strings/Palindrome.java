package Strings;
import java.util.*;
public class Palindrome {
    public static boolean checkPalindrome(String str) {
        int i = 0;  int j = str.length()-1;
        while(j > i) {
            char ch = str.charAt(i);
            char dh = str.charAt(j);
            if(ch != dh) return false;
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter String : ");
            String str = sc.nextLine();
            if(checkPalindrome(str)) {
                System.out.println("Yes It is a Palindrome!!");
            } else {
                System.out.println("No it is not a palindrome");
            }
        } finally {
            sc.close();
        }




    }
}
