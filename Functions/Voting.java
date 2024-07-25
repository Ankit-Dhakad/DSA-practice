package Functions;

import java.util.Scanner;
public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        CasteVote(age);

    }
    static void CasteVote(int age){
        if(age > 18 || age == 18){
            System.out.println("You are Eligible for casting the Vote");
        } else {
            System.out.println("You are Not Eligible for casting the Vote");
        }
    }
}
