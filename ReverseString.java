//Q. Reverse a string in java

import java.util.Scanner;
/*if you write the like :   word = word + str.charAt(i);     it is not going to print reversed string. if i take
* example of
*              Hello
*                      so this    :-    word = word + str.charAt(i);  will print
*                                                                                      Hello
* and if you write like : word = str.charAt(i) + word;    it is going to print reversed string
*                                                                                                olleH
*
* so i can clearly see that just by changing the "word's" place in the same program i can get a reversed string or not
* reversed; */
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            word = str.charAt(i) + word;
        }
        System.out.println("Reversed String : " + word);
    }
}