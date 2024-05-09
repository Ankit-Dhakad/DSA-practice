//Q8.Write a program to input principal, time and rate(P,T,R)from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        int principal = sc.nextInt();
        System.out.print("Enter The time in years : ");
        int time = sc.nextInt();
        System.out.print("Enter the Interest Rate : ");
        int Rate = sc.nextInt();

        int SI = (principal * time * Rate) / 100;
        System.out.println("The Interest of your " + principal + " Rupees is : " + SI);
    }
}