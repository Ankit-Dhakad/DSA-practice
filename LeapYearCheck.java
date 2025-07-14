// Q1. Input a year and find whether it is a leap year or not.

import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int Year = sc.nextInt();
        if(Year % 4 == 0) {
            System.out.println("This is a Leap Year");
        } else {
            System.out.println("This is not a Leap Year");
        }
    }
}
