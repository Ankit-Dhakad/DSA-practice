/*Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n
is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.

4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1
*/

package Functions;
import java.util.Scanner;
public class factorialFunction {
    public static void main(String[] args) {
        long num = 1;
        factorial(num);

    }
    static void factorial(long num){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextInt();
        long factorials = 1;
        for(int i = 2; i <= num; i++){
            factorials = factorials * i;
        }
        System.out.print("The " + num + "! is :- "+ factorials);
    }
}
