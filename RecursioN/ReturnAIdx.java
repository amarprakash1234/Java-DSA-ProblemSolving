import java.util.*;
public class ReturnAIdx {
    public static ArrayList<Integer> allIndices(int[] arr, int x, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if(i >= arr.length) {
            return list;
        } 
        list = allIndices(arr, x, i+1);
        if(arr[i] == x) {
            list.add(0, i);
        }
        return list;
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
            ArrayList<Integer> list = allIndices(arr, x, 0);
            System.out.println("All indices of x is : " + list);
        } finally {
            sc.close();
        }
    }
}
