import java.util.*;
public class RemoveA {
    public static String removeA2(String str) {
        if(str.length() == 0) return "";
        char ch = str.charAt(0);
        if(ch == 'a') {
            return removeA2(str.substring(1));
        }else{
            return ch + removeA2(str.substring(1));
        }
    }
    public static String removeA(String str, int i) {
        if(i == str.length()) return "";
        char ch = str.charAt(i);
        if(ch == 'a') {
            return removeA(str, i+1);
        }else {
            return ch + removeA(str, i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the String : ");
            String str = sc.nextLine();
            String ans = removeA2(str);
            System.out.println("string after removeing charecter a is : " + ans);
        } finally {
            sc.close();
        }

    }
}
