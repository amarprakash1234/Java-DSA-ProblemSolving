import java.util.*;
public class PrintRev {
    public static String makeRev(String str) {
        if(str.length() == 0) return "";
        char ch = str.charAt(0);
        String smallAns = makeRev(str.substring(1));
        return smallAns + ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the String : ");
            String str = sc.nextLine();
            String ans = makeRev(str);
            System.out.println("String after reversing is : "+ ans);
        } finally {
            sc.close();
        }
    }
}
