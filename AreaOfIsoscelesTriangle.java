//Q. Area Of Isosceles Triangle

import java.util.Scanner;
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Height : ");
        int H = sc.nextInt();
        System.out.print("Enter the Base ");
        int B = sc.nextInt();

        int area = (H * B)/2;
        System.out.println("The area of Isosceles Triangle : " + area);
    }
}
