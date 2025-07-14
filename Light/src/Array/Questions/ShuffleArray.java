package Array.Questions;

import java.util.Arrays;

public class ShuffleArray {
    // Main method to test the shuffle method
    public static void main(String[] args) {
        // Initialize an array of integers with values 1 through 6
        int[] number = {1, 2, 3, 4, 5, 6};

        // Call the shuffle method with the array and n = 3
        // This means the first 3 elements (1, 2, 3) will be interleaved with the last 3 elements (4, 5, 6)
        int[] result = shuffle(number, 3);

        // Print the shuffled array to see the result
        System.out.println(Arrays.toString(result));
    }

    // Method to shuffle an array based on the given parameter n
    public static int[] shuffle(int[] nums, int n) {
        // Create an array to hold the shuffled elements, with the same length as the input array
        int[] ans = new int[nums.length];

        // Loop through the first n elements to rearrange them
        for (int i = 0; i < n; i++) {
            // Place element from the first half of the array at the even indices of the answer array
            ans[2 * i] = nums[i];

            // Place element from the second half of the array at the odd indices of the answer array
            ans[2 * i + 1] = nums[i + n];
        }

        // Return the shuffled array
        return ans;
    }
}