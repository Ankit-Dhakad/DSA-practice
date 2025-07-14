// Q10. Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("The largest number is : " + b);
        }else if(a == b){
            System.out.println("do not enter the same number on a and b");
        } else {
            System.out.println("The largest number is : " + a);
        }
    }
}

// another way of solving the same question is that i have to add just 1 line after the input of numbers;

// int largest = Math.max(a,b);
//print the largest