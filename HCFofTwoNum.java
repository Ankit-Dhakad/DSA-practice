//Q. HCF Of Two Numbers Program

import java.util.Scanner;

public class HCFofTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 20;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        while (num1 != num2) {
            if (num1 == 0) {
                System.out.println("GCD : " + num2);
                break;
            }
            if(num2 == 0){
                System.out.println("GCD : " + num1);
            }
            if(num1 > num2)
                num1 = num1 - num2;
            if(num2 > num1)
                num2 = num2 - num1;
            }
        if(num1 == num2){
            System.out.println("GCD is : " + num1);
        }
    }
}