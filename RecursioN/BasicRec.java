import java.util.*;
public class BasicRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of array : ");
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            
            
        } finally {
            sc.close();
        }
    }
}