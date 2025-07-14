//Q. Perimeter of Parallelogram;
import java.util.Scanner;
public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base(b) : ");
        int b = sc.nextInt();
        System.out.print("Enter the side(a) : ");
        int a = sc.nextInt();

        int perimeter = 2*(a + b);
        System.out.println("The perimeter of Parallelogram : " + perimeter);
    }
}
