//Q. Perimeter Of Rhombus;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the (a)side : ");
        int a = sc.nextInt();

        int perimeter = 4*a;
        System.out.println("The Perimeter of Rhombus : " + perimeter);
    }
}
