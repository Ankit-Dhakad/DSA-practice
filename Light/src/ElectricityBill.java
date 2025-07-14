//Q. Calculate Electricity Bill

import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total units that is consumed : ");
        int unit = sc.nextInt();

        int bill = unit * 8;
        System.out.print("Your Electricity Bill is : " + bill + " Rupees");
    }
}