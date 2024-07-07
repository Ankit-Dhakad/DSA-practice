//Q. Area Of Equilateral Triangle

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        value of root 3/4;
        double root = .43301270189;
        System.out.print("Enter the side of Equilateral Triangle : ");
        double side = sc.nextInt();
        double area = root * side * side;

        System.out.println("The area of Equilateral Triangle : " + area);
    }
}
