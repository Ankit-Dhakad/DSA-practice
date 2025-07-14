//Q. Volume Of Prism

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        int B = sc.nextInt();
        System.out.print("Enter the Height : ");
        int H = sc.nextInt();

        int Volume = B * H;
        System.out.println("The volume of Prism is : " + Volume);
    }
}
