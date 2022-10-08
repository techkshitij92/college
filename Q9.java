import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
