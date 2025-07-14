// Q3. Take a number as input and print the multiplication table for it.

import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Table Number :- ");
        int TableNumber = sc.nextInt();
        int Table;
        for(int i = 1; i <= 10; i++) {
            Table = i * TableNumber;
            System.out.println(Table);
        }
    }
}
