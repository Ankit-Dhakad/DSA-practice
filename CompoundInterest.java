//Q. Compound Interest java program

import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        double principalAmount = sc.nextDouble();
        System.out.print("Enter the Compound Interest rate : ");
        double InterestRate = sc.nextDouble();
        double r = InterestRate/100;
        System.out.print("Enter the compounding time like you want to be compounded your amount on a weekly basis or monthly basis or yearly basis : ");
        double compoundingFrame = sc.nextDouble();
        System.out.print("Enter the time in which you want to get back your money : ");
        double FinalTime = sc.nextInt();

        double calculate = ((r/compoundingFrame) + 1);
        double CompoundInterest = Math.pow(calculate, FinalTime) * principalAmount;
        System.out.println("Your compound Interest is : " + CompoundInterest);

    }
}