package Array;

// finding value in a ArrayRange

public class MaxValueInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 47, 5, 6, 9};
        System.out.println("The maximum value in a arrayRange is : " + Max(arr, 2, 5));

    }

    static int Max(int[] arr, int Start, int end) {
        // working on edge cases here, like array being null
        if(end < Start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        // searching the max value here
        int maxVal = arr[Start];
        for (int i = Start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}

