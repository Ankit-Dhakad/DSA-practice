//Write a program to print the sum of two numbers entered by user by defining your own method.

package Functions;
import java.util.Scanner;
public class sumFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Num : ");
        int a = sc.nextInt();
        System.out.print("Enter second num : ");
        int b = sc.nextInt();
        int sum = sum(a, b);
        System.out.println("The sum of two numbers is : " + sum);

    }

    static int sum(int a, int b) {
        int add = a + b;
        return add;
    }
}