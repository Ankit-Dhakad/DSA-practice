//Calculate Depreciation Of Value

import java.util.Scanner;
public class DepreciationValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of at the time you bought on the first place : ");
        double NewPrice = sc.nextDouble();
        double depreciation;
        double Time = 0;
        char ch;

        System.out.print("Enter the valid Keyword : ");
        ch = sc.next().charAt(0);
        if (ch == 'b') { // b = bike
            System.out.print("Enter that How much old your asset is (In Years) : ");
            Time = sc.nextDouble();
            if(Time > 0) {
                depreciation = 10;
                double bike = (NewPrice * depreciation) / 100;
                double dep = NewPrice - bike;
                System.out.println("The value after depreciation of your bike is : " + dep);
            } else if (ch == 'c') { //c = car
                System.out.print("Enter that How much old your asset is (In Years) : ");
                Time = sc.nextDouble();
                if (Time == 1 || Time == 2 || Time == 3 || Time == 4 || Time == 5) {
                    depreciation = 60;
                    double car = (NewPrice * depreciation) / 100;
                    double dep1 = NewPrice - car;
                    System.out.println("The value after depreciation of your car is : " + dep1);
                } else {
                    System.out.println("Enter the valid value after compiling it again");
                }
            }
        }
    }
}