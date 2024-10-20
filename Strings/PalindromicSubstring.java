package Strings;
import java.util.*;
public class PalindromicSubstring {
    public static ArrayList<String> palindromicSubString(String str) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j <= str.length(); j++) {
                if(Palindrome.checkPalindrome(str.substring(i, j))) {
                    list.add(str.substring(i, j));
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        try {
            System.out.print("Enter the String : ");
            String str = sc.nextLine();
            ArrayList<String> list = palindromicSubString(str);
            System.out.println(list);
        } finally {
            sc.close();
        }



    }
}
