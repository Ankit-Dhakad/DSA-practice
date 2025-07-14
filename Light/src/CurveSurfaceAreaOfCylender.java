//Q.Curved Surface Area Of Cylinder 2pi*rh

import java.util.Scanner;

public class CurveSurfaceAreaOfCylender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius : ");
        int r = sc.nextInt();
        System.out.print("Enter the Height : ");
        int H = sc.nextInt();

        int area = (2*22*r*H)/7;
        System.out.println("The Curved surface area of cylinder : " + area + "Sq.units");
    }

}
