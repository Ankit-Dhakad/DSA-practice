package Array.Questions;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6};
        int[]result = shuffle(number, 3);

        System.out.println(Arrays.toString(result));
        }

    // Method to shuffle an array based on the given parameter n
    public static int[] shuffle(int[] nums, int n) {
        // Create an array to hold the shuffled elements, with the same length as the input array
        int[] ans = new int[nums.length];

        for(int i = 0; i < n; i++){
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}
