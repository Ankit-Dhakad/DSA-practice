//Q. Calculate Average Marks

import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total S.No. of the marks : ");
        float n = sc.nextInt();
        System.out.print("start entering the marks : ");
        float marks = 0;
        float sum = marks;

        for (int i = 1; i <= n; i++) {
            marks = sc.nextInt();
            sum = sum + marks;
        }
        System.out.println("Your average marks is : " + (sum / n));
    }
}