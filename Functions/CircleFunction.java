package Functions;

import java.util.Scanner;
public class CircleFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle is : ");
        int r = sc.nextInt();
        Circle(r);
    }
    static void Circle(double r){
        double area = (22 * r * r)/7;
        System.out.println("The area of the circle is : " + area);
        double circumference = (2 * 22 * r)/7;
        System.out.println("The circumference of a circle is : " + circumference);
    }
}
