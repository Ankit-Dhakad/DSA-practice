package Array.Questions;

import java.util.Scanner;

public class ElectionOfPresidentTrash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(); // Printing the Empty Line
        System.out.println("SECOND ROUND OF COUNTING....");
        System.out.println(); //Printing the Empty Line
        System.out.print("Enter How Many candidates are running for president : ");
        int candidates = sc.nextInt();
        int[] EVM = EVMmachine(candidates);
        int Quota = 50;

        System.out.println(); //Printing the Empty Line
        for (int i = 0; i < EVM.length; i++) {
            System.out.println("Candidate " + (i + 1) + ": " + EVM[i] + " Votes");
        }

        int MinVal = Minval(EVM);
        int MinIndex = Minindex(EVM);

        System.out.println(); //Printing the Empty Line
        System.out.println("The candidate (" + (MinIndex + 1) + ") Got the Minimum votes which are : " + MinVal);

        /* Now asking the user that after knowing that which candidate Got the Minimum. From that Minimum
        votes the single transferable voting system the votes will going to transfer to other candidates.
        so we are just asking who Got, How much votes */
        int indexToRemove = MinIndex;

        EVM = removeElement(EVM, indexToRemove);
        System.out.println("Updated list of the candidates after removing the candidate who got the least votes : ");
        for (int i = 0; i < EVM.length; i++) {
            System.out.println("candidatie " + (i + 1) + ": " + EVM[i] + " Votes ");
        }

        // Taking Input of who Got the second preference votes
        System.out.println(); //Printing the Empty Line
        System.out.println("Now Taking Input of who Got the second preference votes...");
        System.out.println(); //printing the Empty Line
        for (int i = 0; i < EVM.length; i++) {
            System.out.print("How much vote Candidate " + (i + 1) + ": Got of the second preference of candidate [" +
                    (MinIndex + 1) + "] (Index before updated array) Voters :- ");

            int UpdatedCandidate = sc.nextInt();

            // Adding the second preferential votes
            EVM[i] += UpdatedCandidate;
            System.out.println("After adding the Preferential votes in candidate [" + (i + 1) + "] : " + EVM[i]);

        }
        System.out.println(); // Printing the Empty Line
        // check if any candidate meet the Quota
        for (int i = 0; i < EVM.length; i++) {
            if (EVM[i] >= Quota) {
                System.out.println("Candidate " + (i + 1) + ": Won the election with a Majority Quota of [" + EVM[i] +
                        "] Which is [" + (EVM[i] - Quota) + "] more than the actual Quota.");
                return;
            }
        }

        // if the Quota does not meet in the second round of counting then move on to the Third round of counting
        // The Third round of counting starts from here

        System.out.println(); // Printing the Empty Line
        System.out.println("THIRD ROUND OF COUNTING....");
        System.out.println(); // Printing the Empty Line

        for (int i = 0; i < EVM.length; i++) {
            System.out.println("Candidate " + (i + 1) + ": " + EVM[i] + " Votes");
        }
        System.out.println(); //Printing the Empty Line
        MinVal = Minval(EVM);
        MinIndex = Minindex(EVM); //Recalculate the minimum index for the updated EVM array

        //Printing the minimum votes in Third Round Of Counting
        System.out.println("The Candidate (" + (MinIndex + 1) + ") Got the Minimum votes which are : " + MinVal);

        System.out.println(); // Printing the Empty Line
        EVM = updateAndPrintEVM(EVM, MinIndex);

        // Taking Input of who Got the Third Preference votes
        System.out.println(); //Printing the Empty Line
        System.out.println("Taking Input Of Preferential Votes...");
        for (int i = 0; i < EVM.length; i++) {
            System.out.println(); // Printing the Empty Line
            System.out.print("Candidate " + (i + 1) + ": received Second Preference votes from the removed Candidate ("
                    + (MinIndex + 1) + ") [Index before updated array Voters? :- ");

            // Taking Input for second preference [Third Round Of Counting]
            int UpdatedThirdCandidate = sc.nextInt();

            /* For Example :- Suppose in the second round of counting of votes the candidate (D) Got the least votes
             * which are (27) so breakdown of these votes is something like that :- Candidate (D) Got the First
             * preference votes which are : (20) and in that (7) votes are second preferential votes added to
             * Candidate (D) in second round of counting from the least removed votes of first round of counting*/

            System.out.print("Candidate " + (i + 1) + ": received Third Preference votes from second preference " +
                    "voters of candidate (" + (MinIndex + 1) + ") [Index before updated array of Voters] :- ");

            // Taking Input for Third preference [Third Round Of Counting]
            int ThirdPreference = sc.nextInt();

            // Adding the second preferential votes of who got the least votes after completing the Second Round Of
            // counting And
            /*Adding the Third Preferential votes of the removed candidate ( These votes are those votes which was added
             in the second round of counting by removing the votes of who got the least votes in the first round of
              counting*/

            EVM[i] += (UpdatedThirdCandidate + ThirdPreference);
            System.out.println("After adding the Preferential votes in candidate [" + (i + 1) + "] : " + EVM[i]);

        }
        System.out.println(); //Printing the Empty Line
        // check if any candidate meet the Quota
        for (int i = 0; i < EVM.length; i++) {
            if (EVM[i] >= Quota) {
                System.out.println("Candidate " + (i + 1) + ": Won the election with a Majority Quota of [" + EVM[i] +
                        "] Which is (" + (EVM[i] - Quota) + ") more than the actual Quota.");
                return;
            }
        }
    }

    public static int[] updateAndPrintEVM(int[] EVM, int indexToRemove) {
        EVM = removeElement(EVM, indexToRemove);
        System.out.println("Updated list after removing the Minimum : ");
        for (int i = 0; i < EVM.length; i++) {
            System.out.println("Candidate " + (i + 1) + ": " + EVM[i] + " Votes");
        }
        return EVM;
    }

    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        int[] newArray = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }

    static int Minval(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

    static int Minindex(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int minVal = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int[] EVMmachine(int Candidates) {
        Scanner sc = new Scanner(System.in);
        int[] votes = new int[Candidates];
        String[] Names = new String[Candidates];

        for (int i = 0; i < Candidates; i++) {
            System.out.println(); // Printing the Empty Line
            System.out.print("Enter the Name of the Candidate [" + (i + 1) + "] : ");
            Names[i] = sc.nextLine();
            System.out.print("Now Enter How many vote " + Names[i] + " Got : ");
            votes[i] = sc.nextInt();
            sc.nextLine();
        }
        return votes;
    }
}
