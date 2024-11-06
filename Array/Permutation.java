package Array;

public class Permutation {
    public static void main(String[] args) {
        int[] number = {2,0,1,4,3};
        int [] answer = buildArray(number);

        for(int num : answer){
            System.out.print(num + " ");
        }

    }
    static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
