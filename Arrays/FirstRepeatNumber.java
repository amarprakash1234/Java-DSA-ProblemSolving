package Arrays;
import java.util.*;
public class FirstRepeatNumber {
    public static int findFRE(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n;
        int[] arr;
        try {
            n = sc.nextInt();
            arr = new int[n];
            System.out.print("Enter the elements os array : ");
            for(int i = 0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }finally {
            sc.close();
        }
        System.out.println("First repeating element is : " + findFRE(arr));

        
        



    }
}
