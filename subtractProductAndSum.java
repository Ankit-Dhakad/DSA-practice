//Q. Subtract the Product and Sum of Digits of an Integer; (Leetcode Question)

import java.util.Scanner;

public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            product = product * temp;
            sum = sum + temp;
            n = n/ 10;
        }
        System.out.println("The diff value is : " + (product - sum));
    }
}