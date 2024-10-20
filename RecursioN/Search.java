import java.util.*;
public class Search {
    public static boolean search(int[] arr, int x, int i) {
        if(i == arr.length) return false;
        if(arr[i] == x) {
            return true;
        }
        return search(arr, x, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the size od array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements os array : ");
            for(int i = 0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter x : ");
            int x = sc.nextInt();
            if(search(arr, x, 0)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        } finally {
            sc.close();
        }


    }
}
