//Q. Power in java

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 'n' : ");
        int n = sc.nextInt();
        System.out.print("Enter How much power you want : ");
        int pow = sc.nextInt();

        int power = (int)Math.pow(n, pow);

        System.out.println("After Calculating the number is : " + power);
    }
}
