//Q9.Take in two numbers and an operator(+,-,*,/) and calculate the value.(Use if conditions).
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number a :- ");
        double a = sc.nextDouble();
        System.out.print("Enter the Second Number b :- ");
        double b = sc.nextDouble();
        System.out.print("Enter the character sign :- ");
        char ch = sc.next().charAt(0);
        // Addition
        if (ch == '+') {
            double sum = a + b;
            System.out.println("The sum is : " + sum);

//      Subtracting
        } else if (ch == '-') {
            double subtract = a - b;
            System.out.println("The subtract is : " + subtract);

//      Multiplying
        } else if (ch == '*') {
            double Multiply = a * b;
            System.out.println("The Multiply is : " + Multiply);
//      Dividing
        } else if(ch == '/'){
            double divide = a / b;
            if(b == 0){                  // Addressing the (a/0)
                divide = 0;
            }
            System.out.println("The Divide is : " + divide);
        }
    }
}