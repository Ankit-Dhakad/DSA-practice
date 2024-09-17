package Array;
// The different approach of taking input of colum
import java.util.Arrays;
import java.util.Scanner;
public class TwoArrayS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  //      int r = sc.nextInt();
       // int c = sc.nextInt();

        int[][] arr = new int[3][3];

        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        // output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();

//            we can replace this output forloop by .toString() and it will give the same result
//            System.out.println(Arrays.toString(arr[row]));

//            and we can replace this loop by enhanced forloop
            for(int[] a : arr){
                System.out.println(Arrays.toString(a));
        }
    }
}