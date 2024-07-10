//Q. Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        System.out.print("The factors of " + n + " are : ");
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i + ", ");
            }
        }
    }
}