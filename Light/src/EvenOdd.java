//Q6.Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("The number is even : " + n);
        } else {
            System.out.println("The number is odd : " + n);
        }
    }
}
