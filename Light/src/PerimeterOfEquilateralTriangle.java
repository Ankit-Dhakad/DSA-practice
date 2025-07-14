//Q. Perimeter Of Equilateral Triangle

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side(a) : ");
        int side = sc.nextInt();

        int perimeter = 3*side;
        System.out.println("The perimeter Of Equilateral Triangle : " + perimeter);

    }
}
