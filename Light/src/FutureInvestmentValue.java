//Q. Future Investment value

import java.util.Scanner;

public class FutureInvestmentValue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lumsum amount that you want to Invest : ");
        double pv = sc.nextInt();  // Principal amount(pv)

        System.out.print("Enter the Interest Rate : ");
        double i = sc.nextInt(); // interest Rate (i)%

        System.out.print("Enter the total time of investment : ");
        double n = sc.nextInt(); // Total Time (n)

//        Now What will be the future value of Investment (FV) = pv*(1+i)power n

        double interestRate = (i/100) + 1;
        double FV = pv * Math.pow(interestRate, n);

        System.out.print("The Future Value of your Investment is : " + FV);
    }
}