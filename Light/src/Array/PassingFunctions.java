package Array;

import java.util.Arrays;
public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {2,3,34,42,5233,0};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[4] = 23;
    }
}
// Arrays are mutable in java but String is immutable in java