//Q. java program for checking that is it a vowel or consonant character

import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Alphabet : ");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " : It is Vowel");
        } else {
            System.out.println(ch + " : It is a Consonant");
        }
    }
}