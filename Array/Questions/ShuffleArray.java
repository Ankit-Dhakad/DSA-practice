package Array.Questions;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6};
        int[]result = shuffle(number, 3);

        System.out.println(Arrays.toString(result));
        }

    public static int[] shuffle(int[] nums, int n){
        int[] ans = new int[nums.length];

        for(int i = 0; i < n; i++){
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}
