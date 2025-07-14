//Q. Volume Of Cylinder

import java.util.*;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius(r) : ");
        double r = sc.nextInt();
        System.out.print("Enter the Height : ");
        double H = sc.nextInt();

        double Volume = (3.14 * r * r * H);

        System.out.println("The Volume Of Cylinder : " + Volume);
    }
}
