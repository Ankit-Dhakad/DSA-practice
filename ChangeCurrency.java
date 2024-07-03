import java.util.Scanner;
public class ChangeCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rupees : ");
        double rupees = sc.nextInt();
        double exchangeRate = 83;
        double USD = rupees / exchangeRate;
        System.out.println("The USD is : " + USD);
    }
}