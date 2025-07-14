import java.util.Scanner;
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base : ");
        int Base = sc.nextInt();
        System.out.print("Enter the Height : ");
        int Height = sc.nextInt();

        Rhombus(Base, Height);
    }
    static void Rhombus(int Base, int Height){
        int area = (Base * Height);
        System.out.println("The area Of Rhombus : " + area);
    }
    static void RhombusDiagonalArea(int d1, int d2){
        int area = (d1 * d2)/2;
        System.out.println("The area of Rhombus : " + area);
    }
}
