//Q. Volume of pyramid

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base length of the pyramid : ");
        int l = sc.nextInt();
        System.out.print(("Enter the Base width : "));
        int w = sc.nextInt();
        System.out.print("Enter the pyramid Height : ");
        int h =  sc.nextInt();

        int Volume = (l * w * h)/3;
        System.out.println("The volume of pyramid : " + Volume);
    }
}
