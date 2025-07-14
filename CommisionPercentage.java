//Q. Calculate Commission percentage

import java.util.Scanner;

public class CommisionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the product : ");
        int price = sc.nextInt();
//        System.out.println("Enter the Discount percentage : ");
//        int Discount = sc.nextInt();
        System.out.print("Enter the Commission Percentage : ");
        int Commission = sc.nextInt();

//        int DiscountedPrice = (price * Discount)/100;
        int CommissionPrice = (price * Commission)/100;

        System.out.println("Your commission is : " + CommissionPrice);
    }
}
