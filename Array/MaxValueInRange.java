package Array;

// finding value in a ArrayRange

public class MaxValueInRange {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 47, 5, 6, 9};
        System.out.println("The maximum value in a arrayRange is : " + Max(arr, 2, 5));

    }

    static int Max(int[] arr, int Start, int end) {
        int maxVal = arr[Start];
        for (int i = Start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}

