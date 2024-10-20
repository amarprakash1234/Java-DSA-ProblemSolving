import java.util.*;
public class Findidx {
    public static int findindx(int[] arr, int x, int i) {
        if(i >= arr.length) return -1;
        if(arr[i] == x) return i;
        return findindx(arr, x, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the size of array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elementa of Array : ");
            for(int i = 0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter x : ");
            int x = sc.nextInt();
            int y = findindx(arr, x, 0);
            System.out.println("Index of x in array is : " + y);
        } finally {
            sc.close();
        }



    }
}
