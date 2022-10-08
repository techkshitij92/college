import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        
        System.out.print("Enter Your Course Name : ");
        String courseName = sc.nextLine();

        System.out.print("Enter Your Semester Number : ");
        int sem = sc.nextInt();
        
        System.out.print("Enter Your Roll No. : ");
        int roll = sc.nextInt();
        
        sc.nextLine();

        System.out.print("Enter Your Paper Name : ");
        String paperName = sc.nextLine();

        System.out.println("Hello I'm " + name);
        System.out.println("Course : "+ courseName);
        System.out.println("Semester : " +sem );
        System.out.println("Roll No. : " +roll );
        System.out.println("Paper Name : " +paperName );
        sc.close();
    }
}