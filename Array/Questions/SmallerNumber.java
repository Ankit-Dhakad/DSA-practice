package Array.Questions;

import java.util.Scanner;
import java.util.Arrays;

public class SmallerNumber {
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
        int []SmallerNum = num(arr);
        System.out.println(Arrays.toString(SmallerNum));
    }

    static int[] num(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}