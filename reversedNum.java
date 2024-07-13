//Q. Find if a number is palindrome or not

import java.util.Scanner;

public class reversedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int r = n;
        int reverse = 0;
        while (n > 0) {
            int temp = n % 10;
            reverse = reverse * 10 + temp;
            n = n / 10;
//            System.out.println();
        }
        if (reverse == r) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}