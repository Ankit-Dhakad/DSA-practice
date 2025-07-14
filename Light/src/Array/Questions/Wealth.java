package Array.Questions;

public class Wealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int size = rich(arr);
        System.out.println("The wealth of the richest customer : " + size);
    }

    static int rich(int[][] accounts) {
        int maxWealth = 0; // Initialize maxWealth to 0
        for (int i = 0; i < accounts.length; i++) { // Outer loop: Iterate through each customer
            int wealth = 0; // Initialize wealth for the current customer
            for (int j = 0; j < accounts[i].length; j++) { // Inner loop: Calculate the customer's wealth
                wealth += accounts[i][j]; // Add the money in each bank account
            }
            if (wealth > maxWealth) { // Compare and update maxWealth
                maxWealth = wealth;
            }
        }
        return maxWealth; // Return the wealth of the richest customer
    }
}