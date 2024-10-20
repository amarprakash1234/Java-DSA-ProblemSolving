package Strings;
// Given a string print all substring of string...
import java.util.*;
public class StringBasic {
    public static ArrayList<String> returnAllSubString(String str) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < str.length(); i++) {
            for(int j = i+1; j <= str.length(); j++) {
                list.add(str.substring(i, j));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the String : ");
            String str = sc.nextLine();
            ArrayList<String> list = returnAllSubString(str);
            System.out.println(list);
        } finally {
            sc.close();
        }
        




    }
}
