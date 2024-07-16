import java.util.Scanner;

public class Special26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start entering Numbers and to print the sum of all press 0 : ");
        int negativeSum = 0, evenSum = 0, oddSum = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                negativeSum += n;
            } else if (n % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        }
        System.out.println("The sum negative numbers : " + negativeSum);
        System.out.println("The sum of positive even numbers : " + evenSum);
        System.out.println("The sum of positive odd numbers : " + oddSum);
    }
}