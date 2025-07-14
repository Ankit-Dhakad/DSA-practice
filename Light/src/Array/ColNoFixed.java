package Array;

import java.util.Arrays;
import java.util.Scanner;
public class ColNoFixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {8, 9, 7}
        };
//        This is a one way of getting an output by using enhanced forLoop

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));


//            This is another way of getting an output by using simple for loop

//        for(int row = 0; row < arr.length; row++){
//            for(int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
        }
    }
}
