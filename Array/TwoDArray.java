package Array;
import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        /*

            1 2 3
            4 5 6
            7 8 9

        */
 /*The 1D array is initialized by one bracket
 *      int[] arr = new int[];
 * The 2D array is initialized by two brackets
 *      int[][] arr = new int[3][3]*/  // This is not the best ways initialize 2D  Array

//        The best way of initializing 2D array

        int[][] arr = new int[3][];
        int[][] arr2D = {
                {3,4,2,45}, // 0th Index
                {34,53,93}, // 1st Index
                {223, 98, 32,534} //2nd Index      /*The size of this row or any row in 2D array does not matter
                // because i can be of any size*/
        };
    }
}
