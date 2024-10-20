package Strings;
import java.util.*;
public class ToogleString {
    public static String toogleString(String str) {
        String ans = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ') {
                ans += ch;
                continue;
            }
            int ascii = (int) ch;
            if((ascii<65 || ascii>90) && (ascii<97 || ascii>122)) {
                ans += ch;
                continue;
            }
            if(ascii <= 90  &&  ascii >= 65) {
                ascii += 32;
                ch = (char) ascii;
                ans += ch;
            } else {
                ascii -= 32;
                ch = (char) ascii;
                ans += ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the String : ");
            String str = sc.nextLine();
            String ans = toogleString(str);
            System.out.println(ans);

        } finally {
            sc.close();
        }


    }
}
