//Q. The Total Surface Area of Cube 6a square

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of the cube (a) : ");
        int a = sc.nextInt();

        int area = (a * a)*6;
        System.out.println("The Total surface area of cube : " + area);

    }
}
