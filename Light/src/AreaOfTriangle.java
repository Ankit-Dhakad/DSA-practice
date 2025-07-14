//Q. Area Of Triangle

import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Base : ");
        int B = sc.nextInt();
        System.out.print("Enter the Height : ");
        int H = sc.nextInt();

        int area = (B * H) / 2;
        System.out.println("The area of Triangle is : " + area);
    }
}