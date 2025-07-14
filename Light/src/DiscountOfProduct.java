//Q. Calculate the Discount of product.

import java.util.Scanner;
public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of Product : ");
        int price = sc.nextInt();
        System.out.print("Enter the discount Percentage : ");
        int percentage = sc.nextInt();

        int discount = (price * percentage)/100;

        int productPrice = price - discount;
        System.out.print("The price of a product after cutting discount is : " + productPrice + " Rupees");
    }
}