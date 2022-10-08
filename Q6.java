import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Numbers :");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("a==b : " +(a==b));
        System.out.println("a!=b : " +(a!=b));
        System.out.println("a<b : " +(a<b));
        System.out.println("a>b : " +(a>b));
        System.out.println("a<=b : " +(a<=b));
        System.out.println("a>=b : " +(a>=b));

        System.out.println("Conditional Operators");

        System.out.println("a <= b && b <= a : " +(a <= b && b <= a));
        System.out.println("a <= b || b <= a : " +(a <= b || b <= a));
        System.out.println("a == b ? Equal : Not Equal --> "+ (a == b ? "Equals" : "Not Equal"));

      
        sc.close();
    }
}
