//Q. Perimeter of circle

import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int r = sc.nextInt();

        int area = (2*22*r)/7;
        System.out.println("The Perimeter of Circle : " + area);

    }
}
