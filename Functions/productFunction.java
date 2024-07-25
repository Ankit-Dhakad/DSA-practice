package Functions;

import java.util.Scanner;
public class productFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int secondNum = sc.nextInt();

        int product = multiply(firstNum, secondNum);
        System.out.println("The Product of Two Number is : " + product);
    }
    static int multiply(int a, int b){
        int Multiply = a * b;
        return Multiply;
    }
}
