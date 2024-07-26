//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

package Functions;

import java.util.Scanner;
public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = sc.nextInt();
        System.out.print("Enter the second Number : ");
        int second = sc.nextInt();
        System.out.print("Enter the third Number : ");
        int third = sc.nextInt();

        int smallestNum = smallest(first, second, third);
        int largestNum = largest(first, second, third);

        System.out.println("The smallest Number is : " + smallestNum);
        System.out.println(("The largest Number is : " + largestNum));

    }

    static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }

    static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }
}
