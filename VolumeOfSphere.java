//Q. Volume of Sphere

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius(r) : ");
        double r = sc.nextInt();

        double volume = ((4 * 22 * r * r * r)/(7*3));
        System.out.println("The Volume of sphere : " + volume);
    }
}