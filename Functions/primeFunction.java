//Define a method to find out if a number is prime or not.

package Functions;

import java.util.Scanner;
public class primeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Num : ");
        int num = sc.nextInt();
        boolean ans = prime(num);
        System.out.println(ans);
    }

    static boolean prime(int num) {
        if (num <= 1) {
            System.out.println("It is not a prime number");
        }
        int p = 2;
        while (p * p <= num) {
            if (num % p == 0) {
                return false;
            }
            p++;
        }
        return p * p > num;
    }
}