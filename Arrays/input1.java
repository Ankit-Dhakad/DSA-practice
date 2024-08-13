package Arrays;

import java.util.Scanner;

public class input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Taking an input for How much this array length is going to be
        System.out.print("Enter the array Length : ");
        int n = sc.nextInt();

//        giving an array length via 'n'
        int[] arr = new int[n];

//        Taking Input via using Loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        printing an array via loops
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
