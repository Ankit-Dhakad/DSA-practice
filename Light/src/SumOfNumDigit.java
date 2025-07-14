//Q. Sum Of A Digits Of Number

/*The digit sum of a number, say 152, is just the sum of the digits, 1+5+2=8. If the sum of the digits is greater
than nine then the process is repeated. For example, the sum of the digits for 786 is 7+8+6=21 and the sum of the
digits for 21 is 3 so the digit sum of 786 is 3  */

import java.util.Scanner;

public class SumOfNumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int num = sc.nextInt();
        Digit(num);
    }

    static void Digit(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                int temp = n % 10;
                sum = sum + temp;
                n = n / 10;
            }
            int p = (n = sum);
        }
        System.out.println("THE SUM OF DIGIT 'N' IN A SINGLE DIGIT : " + n);
    }
}