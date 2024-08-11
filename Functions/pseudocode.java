package Functions;
import java.util.Scanner;
public class pseudocode {
    public static void main(String[] args) {
        int num = 1;
//        int num2 = 0;
        leapyear(num);
    }
    static void leapyear(int year){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        year = sc.nextInt();
        if(year % 4 == 0 ){
            System.out.println("The Year " + year + " is a leap year");
        } else {
            System.out.println("The Year " + year + " is not a leap year");
        }
    }
    static void sumOfTwo(int a , int b){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a = sc.nextInt();
        System.out.print("Enter the second number : ");
        b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum is : " + sum);
    }
    static void table(int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for table : ");
        n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n * i);
        }
    }
    static void LcmHcf(int num1, int num2){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        num2 = sc.nextInt();

        int gcd = 1;

        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        int lcm = (num1 * num2)/gcd;
        System.out.println("The LCM of num1 and num2 is : " + lcm);
    }
    static void untilX(int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("Start Entering the number : ");
        n = sc.nextInt();
        int sum = n;
        int num = 'x';

        while(n != 0){
            n = sc.nextInt();
            int temp = n;
            sum = sum + temp;
            if(n == 0){
                System.out.println("The sum is : " + sum);
            }
        }
    }
}
