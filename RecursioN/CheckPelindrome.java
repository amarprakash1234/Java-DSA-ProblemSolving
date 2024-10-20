import java.util.*;
public class CheckPelindrome {
    public static boolean checkP(String str, int i, int j) {
        if(i >= j) return true; 
        int ch1 = str.charAt(i);
        int ch2 = str.charAt(j);
        if(ch1 != ch2) {
            return false;
        } else {
            return checkP(str, i+1, j-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the String : ");
            String str = sc.nextLine();
            if(checkP(str, 0, str.length()-1)) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        } finally {
            sc.close();
        }



    }
}
