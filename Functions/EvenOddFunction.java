package Functions;

import java.util.Scanner;
public class EvenOddFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        Evenodd(num);
    }

    static void Evenodd(int num) {
        if (num % 2 == 0) {
            System.out.println("The Number : " + num + " : It is Even");
        } else {
            System.out.println("The Number : " + num + " : It is Odd Number");
        }
    }
}