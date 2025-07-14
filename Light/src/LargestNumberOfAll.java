//Q. Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargestNumberOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, max = Integer.MIN_VALUE;

        do {
//            assigning a value to n; and yes taking input also;
            n = sc.nextInt();
            if (n > max && n != 0) {
                max = n;
            }
        }
        while (n != 0);
        if (n != Integer.MIN_VALUE) {
            System.out.println("The Largest number is : " + max);
        } else {
            System.out.println("No number were entered");
        }
    }
}