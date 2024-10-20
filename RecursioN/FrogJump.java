import java.util.*;
public class FrogJump {
    public static int best(int[] h, int i) {
        if(i == h.length-2) return Math.abs(h[h.length-2] - h[h.length-1]);
        if(i == h.length-3) {
            int x = Math.abs(h[h.length-3] - h[h.length-2]) + Math.abs(h[h.length-2] - h[h.length-1]);
            int y = Math.abs(h[h.length-3] - h[h.length-1]);
            return Math.min(x, y);
        }
        int smallAns1 = best(h, i+1) + Math.abs(h[i] - h[i+1]);
        int smallAns2 = best(h, i+2) + Math.abs(h[i] - h[i+2]);
        return Math.min(smallAns1, smallAns2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the size of array : ");
            int n = sc.nextInt();
            int[] h = new int[n];
            System.out.print("Enter the elementa of Array : ");
            for(int i = 0; i<h.length; i++) {
                h[i] = sc.nextInt();
            }
            int x = best(h, 0);
            System.out.println("Minimum Possible total cost is : " + x);
        } finally {
            sc.close();
        }




    }
}
