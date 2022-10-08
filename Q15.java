import java.util.*;
public class Q15 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Power :");
        int pow = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result = result*2;
    }
    System.out.println("result : " + result);
    sc.close();
}   
}
