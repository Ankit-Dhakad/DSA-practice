//Q. Write a function to find if a number is a palindrome or not. Take number as parameter.

package Functions;
import java.util.Scanner;
public class palindromeFunction {
    public static void main(String[] args) {

        int n = 0;
        palindrome(n);
    }
    static void palindrome(int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int r = n;
        int reverse = 0;
        while(n > 0){
            int temp = n % 10;
            reverse = reverse * 10 + temp;
            n = n / 10;
        }
        if(reverse == r){
            System.out.println("The number " + r + " is a Palindrome number");
        }else{
            System.out.println("The number " + r + " is not a Palindrome number");
        }
    }
}
