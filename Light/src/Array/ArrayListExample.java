package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//   we can arraylist like this and it doesn't care about the capacity as well take as many as you want

        list.add(32);
        list.add(45);
        list.add(543);
        list.add(2251);
        list.add(2529);
        list.add(525);
        list.add(4335);
        list.add(63);
        list.add(2);
        list.add(222);
        list.add(26322);
        list.add(322);
        list.add(5222);
        list.add(25232);
        list.add(8922);
        list.add(0);

//        we can do much more things with list

        list.get(3);
        System.out.println(list.contains(8922));

        list.set(1, 21);
        list.remove(3);

        System.out.println(list);


    }
}
