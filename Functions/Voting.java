/*A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is
eligible to vote.*/

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
