//Q. Calculate Batting Average

import  java.util.Scanner;
public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cricketer Name : ");
        String Name = sc.nextLine();
        System.out.print("Please Enter the Total runs that he scored in the matches : ");
        double TotalRuns = sc.nextDouble();
        System.out.print("Please Enter the How many times he got out in these matches : ");
        double out = sc.nextDouble();

        double BattingAverage = TotalRuns / out;
        System.out.print("The Batting Average of " + Name + " is : " + BattingAverage);
    }
}
