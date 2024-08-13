package Array;

import java.util.*;

public class input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Taking an input for How much this array length is going to be
        System.out.print("Enter the array Length : ");
        int n = sc.nextInt();

//        giving an array length via 'n'
//        int[] arr = new int[n];

//        Taking Input via using Loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr)); //best way to print an arrays
//        printing an array via loops
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ", ");
//        }
        // foreach loop
//        for (int num : arr) { // for every element in array, print the element
//            System.out.print(num + " "); // here num represents element of the array
//        }
//        System.out.println(arr[5]); /*index out of bound of error :- because this program is exceeding the array
//        length limit*/

        //array of objects (Taking input of String)
        String[] str = new String[n];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}