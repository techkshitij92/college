import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks :");
        double M1 = sc.nextDouble();
        double M2 = sc.nextDouble();
        double M3 = sc.nextDouble();
        double avg = (M1+M2+M3)/3;
        if (avg >=80 && avg <= 100)
            System.out.println("Honors");
        else if (avg>=60 && avg <=79)
            System.out.println("First division");
        else if (avg>=50 && avg <=59)
            System.out.println("Second Divison");
        else if (avg>=40 && avg <=49)
            System.out.println("Third Division");
        else 
            System.out.println("Fail");
        sc.close();
    }
}
