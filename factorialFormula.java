import java.util.Scanner;

public class factorialFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long n = sc.nextInt();
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
//            System.out.println("The factorial is : " + factorial);
        }
        System.out.println("The factorial is : " + factorial);
    }
}