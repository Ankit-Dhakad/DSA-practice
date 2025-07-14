package Array;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        // input

        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }
        // output and get item at any index
        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
    }
}
