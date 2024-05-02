// Q2. Take two numbers and print the sum of both

import java.util.Scanner;
public class SumOfTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.print("The sum of Two numbers is : ");
    }
}

