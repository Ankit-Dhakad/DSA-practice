package Array;

// Finding Maximum value in array

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9};
        System.out.println("The maximum value of array is : " + Max(arr));

    }
    static int Max(int[] arr){
        int maxVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
