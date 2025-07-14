/*Ankit is allowed to go out with his friends only on the even days of a given month. Write a program to count the
number of days he can go out in the month of August*/

import java.util.Scanner;

public class GoOutAugust {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 31;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("The Ankit can go out with his friends in august : " + count + " Times");
    }
}