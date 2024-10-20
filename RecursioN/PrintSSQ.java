import java.util.*;
public class PrintSSQ {
    static void printSSQ(String str, String ans) {
        if(str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        char ch  = str.charAt(0);
        String remS = str.substring(1);
        printSSQ(remS, ans + ch);
        printSSQ(remS, ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the string : ");
            String str = sc.nextLine();
            printSSQ(str, "");
        } finally {
            sc.close();
        }



    }
}
