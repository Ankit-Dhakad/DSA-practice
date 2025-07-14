//Q. Perimeter Of Square
import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter (a)side : ");
        int a = sc.nextInt();

        int perimeter = 4*a;
        System.out.println("The square Of a perimeter : " + perimeter);
    }
}
