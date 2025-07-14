package Array.Questions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Now Taking the input that Total how many kids we have
        System.out.print("What is the number of Total kids : ");
        int kids = sc.nextInt();


        //Now Take the input that How many extraCandies i have;
        System.out.print("How many extraCandies we have : ");
        int extraCandies = sc.nextInt();


        // initializing the array and array length by giving input (kids)
        System.out.println("Start Entering How much Candies each kids already have : ");
        int[] arr = new int[kids];

        // Now taking an input for How much candies each kid have;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

        }
        List<Boolean> result = max(arr, extraCandies);
        System.out.println("Result : " + result);

    }
    static List<Boolean> max(int[] Candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();

        // Find the current maximum candies;
        int maxCandy = Candies[0];
        for (int i = 1; i < Candies.length; i++) {
            if (Candies[i] > maxCandy) {
                maxCandy = Candies[i];
            }
        }
        // Checking with each Kid that who have the less than or equal to maxCandy;
        for (int i = 0; i < Candies.length; i++) {
            if (Candies[i] + extraCandies >= maxCandy) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}