//Q. To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int i = 0, j = name.length() - 1;
        while (i < j) {
            if (name.charAt(i) != name.charAt(j)) {
                System.out.println("It is not a palindrome string");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("It is a palindrome string");
    }
}