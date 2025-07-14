package Functions;

import java.util.Scanner;

public class PrimeModifiedCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        isPrime(n);
    }

    static void isPrime(int n) {
        if (n <= 1) {
            System.out.println("It is not a prime number");
            return;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println("It is not a prime number");
                return;
            }
        }
        System.out.println("It is a prime number");
    }
}