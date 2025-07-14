import java.util.Scanner;
public class VolumeOfCone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius(r) : ");
        double r = sc.nextInt();
        System.out.print("Enter the Height(h) : ");
        double h = sc.nextInt();

        double volume = ((22*h)/(7*3)) * (r * r);
        System.out.println("The Volume of Cone is : " + volume);
    }

}
