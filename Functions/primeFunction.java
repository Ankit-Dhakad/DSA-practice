package Functions;

import java.util.Scanner;
public class primeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Num : ");
        int num = sc.nextInt();
        prime(num);
    }

    static void prime(int num) {
        if (num % 2 != 0 || num == 2) {
            System.out.println("The Num : " + num + " : It is a prime number");
        } else {
            System.out.println("The Num : " + num + " : It is not a prime number");
        }
    }
}