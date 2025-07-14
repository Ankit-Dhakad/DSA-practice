//Q. java program for a checking whether is it a  perfect Number

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("The number is a perfect Number : " + sum);
        } else {
            System.out.println("The number is not a perfect number");
        }
    }
}

