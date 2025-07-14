//Q. Calculate Distance between Two points

// What is Distance Between Two Points Formula?

/*Distance between two points is the length of the line segment that connects the two points in a plane.The formula to
find the distance between the two points is usually given by d=√((x2 – x1)² + (y2 – y1)²).  This formula is used to
find the distance between any two points on a coordinate plane or x-y plane.*/

//Distance Formula for Two Points.

/*As discussed, the distance formula is used to find the distance between any two points, when we already know the
coordinates. The points could be present alone on the x-axis or y-axis or in both axes.

*/
//
import java.util.*;
public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2);
        double root = Math.sqrt(distance);
        System.out.println("The distance between two points is : " + root);
    }
}