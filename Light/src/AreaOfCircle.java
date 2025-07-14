// Q. Area Of Circle Java Program
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double r = sc.nextInt();
        double area = (22 * r * r)/7;
        System.out.println("The area of circle is : " + area);
    }
}
