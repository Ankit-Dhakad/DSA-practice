//Q7.Take name as input and print a greeting message for that particular name.

import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        System.out.println("Happy Birthday my love my " + name);
    }
}
