
import java.util.*;
public class ReturnSSQ {
    public static ArrayList<String> getSSQ(String str) {
        ArrayList<String> ans = new ArrayList<>();
        if(str.length() == 0) {
            ans.add("");
            return ans;
        }
        char ch = str.charAt(0);
        ArrayList<String> smallAns = getSSQ(str.substring(1));
        for(String s : smallAns) {
            ans.add(s);
            ans.add(ch + s);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the String : ");
            String str = sc.nextLine();
            ArrayList<String> ans = new ArrayList<>();
            ans = getSSQ(str);
            System.out.println("All Sub Sequences are : " + ans);
        }finally {
            sc.close();
        }



    }
}