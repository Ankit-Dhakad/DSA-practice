package Array.Questions;

import java.util.Scanner;
//import java.util.Arrays;
public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking the input of size of the array;
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        // Initializing the array and also giving the size(n) to an array
        int[] arr = new int[n];

        System.out.print("Enter The Array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int pairs = num(arr);
        System.out.print("The indices of Good Pairs are : " + pairs);
    }

    static int num(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}