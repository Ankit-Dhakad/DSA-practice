//Q. Area Of Parallelogram

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Base : ");
        int B = sc.nextInt();
        System.out.print("Enter the Height : ");
        int H = sc.nextInt();

        int area = B * H;
        System.out.println("The area of Parallelogram : " + area);

    }
}
