//Q5. keep taking numbers as inputs till the user enters "x", after that print sum of all.

import java.util.*;
public class ZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;

        while (n != 0) {
            n = sc.nextInt();
            sum = sum + n;
            if(n == 0){
                System.out.println("The sum is : " + sum);
            }
        }
    }
}