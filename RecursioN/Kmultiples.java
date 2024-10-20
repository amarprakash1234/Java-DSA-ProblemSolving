import java.util.*;
public class Kmultiples {
    public static void printKM(int num, int k) {
        if(k == 0) return;
        printKM(num, k-1);
        System.out.print((num * k) + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number : ");
            int num = sc.nextInt();
            System.out.print("Enter k : ");
            int k = sc.nextInt();
            printKM(num, k);
        } finally {
            sc.close();
        }

    }
}
