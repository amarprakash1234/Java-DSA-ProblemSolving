package Arrays;
import java.util.*;
public class QQueries {
    public static int[] makeFArr(int[] arr) {
        int[] freq = new int[100001];
        for(int i = 0; i<arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
    public static boolean xPresent(int x, int[] freq) {
        if(freq[x] > 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n;
        int[] arr;
        int q;
        try {
            n = sc.nextInt();
            arr = new int[n];
            System.out.print("Enter the elements os array : ");
            for(int i = 0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int[] freq = makeFArr(arr);
            System.out.print("Enter number of queries : ");
            q = sc.nextInt();
            while(q > 0) {
                System.out.print("Enter the number to be searched : ");
                int x = sc.nextInt();
                if(xPresent(x, freq)) {
                    System.out.println("Yes ");
                } else {
                    System.out.println("No");
                }
                q--;
            }
        }finally {
            sc.close();
        }



    }
}
