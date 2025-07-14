//Q. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class UntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start entering Numbers and to print the sum of all press 0 : ");
        int n = sc.nextInt();
        int sum = n;
        while (n != 0) {
            n = sc.nextInt();
            int temp = n;
            sum = sum + temp;
            if (n == 0) {
                System.out.println("The sum is : " + sum);
            }
        }
    }
}