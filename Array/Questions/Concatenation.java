package Array.Questions;

public class Concatenation {
    public static void main(String[] args) {
        int[] number = {2, 0, 1, 4, 3};
        int[] answer = concatenation(number);

        for (int num : answer) {
            System.out.print(num + " ");
        }

    }

    static int[] concatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}