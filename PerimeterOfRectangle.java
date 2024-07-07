//Q. Perimeter of Rectangle
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length(l) : " );
        int l = sc.nextInt();
        System.out.println("Enter the width(W) : ");
        int w = sc.nextInt();

        int perimeter = (l+w)*2;

        System.out.println("The Perimeter of Rectangle : " + perimeter);
    }
}
