//Q. Calculate Average of N Numbers

import java.util.Scanner;
public class AverageOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double sum = n;
        double count = 0;
//        char ch = 'a';
        while (n != 0) {
            n = sc.nextInt();
            sum = sum + n;
            count++;
            if (n == 0) {
                System.out.println("The average of N numbers is : " + sum / count);
            }
        }
    }
}