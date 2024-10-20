package Basics;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the operands : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("Enter the operator : ");
            char ch = sc.next().charAt(0);
            switch(ch) {
                case '+' : System.out.println("Addition is : " + (a+b));
                                break;
                case '-' : System.out.println("Subtraction  is : " + (a+b));
                                break;
                case '*' : System.out.println("Product is : " + (a*b));
                                break;
                case '/' : System.out.println("Divide is : " + (a/b));
                                break;
                case '%' : System.out.println("Remainder is : " + (a%b));
                                break;
                default : System.out.println("Wrong operator !!");
            }
        } finally {
            sc.close();
        }



    }
}
