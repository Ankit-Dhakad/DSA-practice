//Q. Area of Rectangle program

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        int l = sc.nextInt();
        System.out.print("Enter the width : ");
        int w = sc.nextInt();

        int area = l * w;
        System.out.println("The Area of Rectangle : " + area);
    }
}
