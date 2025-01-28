package Array.Questions;
import java.util.Scanner;

public class ElectionOfPresident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array representing the number of MLAs in different states
        int[] StatesMLA = {175, 60, 126, 243, 90, 40, 182, 90, 68, 81, 224, 140, 230, 288, 60, 60, 40, 60, 70, 147, 30,
                117, 200, 32, 234, 119, 60, 403, 70, 90, 294};

        double sum = 0;

        // Loop through 31 states to calculate the value of votes for all MLAs
        for (int i = 0; i < 30; i++) {
            System.out.print("Enter the state population : ");
            double Population = sc.nextInt();
            double value = StateNames(StatesMLA);

            // Check if the state name entered is valid
            if (value == 0) {
                System.out.println("Invalid state name entered : Please try again");
                i--; // Retry the current iteration
                continue;
            }

            // Calculate the value of vote of 1 MLA
            double valueOfVoteOf1MLA = Population / (value * 1000);
            System.out.println("The value of vote of 1 MLA is : " + valueOfVoteOf1MLA);

            // Calculate the value of vote of all MLAs in the state
            double ValueOfVoteOfAllMLA = value * valueOfVoteOf1MLA;
            System.out.println("The value of vote of all MLA's is : " + ValueOfVoteOfAllMLA);

            sum += ValueOfVoteOfAllMLA;
            System.out.println(" ");
            System.out.println("Enter the next State Population");
        }

        // Printing the total value of votes of all 31 assemblies' MLAs
        System.out.println("The value of vote of all 31 assemblies MLA is : " + sum);

        // Collect the number of elected members in Rajya Sabha and Lok Sabha
        System.out.print("Now Tell Me How Many Elected Members are there in Rajya Sabha : ");
        int RajyaSabhaMembers = sc.nextInt();
        System.out.println("Okk Now Tell Me Elected Members are there in Lok Sabha : ");
        int LokSabhaMembers = sc.nextInt();
        int ParliamentMembers = RajyaSabhaMembers + LokSabhaMembers;
        System.out.println("The Total Elected Members of Parliament are : " + ParliamentMembers);

        // Calculate the value of vote of 1 MP
        double ValueOfVoteOf1MP = sum / ParliamentMembers;
        double ValueOfVoteOfAllMP = ValueOfVoteOf1MP * ParliamentMembers;
        System.out.println("The Value of Vote Of all MP's in a state : " + ValueOfVoteOfAllMP);

        // Calculate the total valid votes
        double TotalValidVotes = sum + ValueOfVoteOfAllMP;
        System.out.println("Total Value of Valid Votes : " + TotalValidVotes);

        // Calculate the quota for a candidate to be elected as President
        double Quota = ((TotalValidVotes) / (1 + 1)) + 1;
        System.out.println("If a Candidate Gets an [" + Quota + "] Votes then HE/SHE shall be elected as President Of India");

        // First round of counting votes
        System.out.print("Now Enter the Total Count of Candidates Running for President Election : ");
        int candidates = sc.nextInt();
        int[] EVM = EVMmachine(candidates);

        // Display the votes each candidate received
        for (int i = 0; i < candidates; i++) {
            System.out.println("Candidate " + (i + 1) + ": " + EVM[i] + " Votes");
        }

        // Check if any candidate meets the quota
        for (int i = 0; i < candidates; i++) {
            if (EVM[i] >= Quota) {
                System.out.println("Candidate " + (i + 1) + ": WON the election with a Majority Quota of "
                        + EVM[i] + " Which is " + (EVM[i] - Quota) + " more than the actual Quota.");
                return;
            }
        }

        // If no candidate meets the quota, move to the second round of counting

        System.out.println("No-one Meets the Quota. Hence no-one won the election so Now we are Moving to the second Round of Counting");
//      /*Finding the which candidate got the minimum votes because after knowing those votes
//      will be transferred to other candidates using via preferential transferring of votes*/

        int Minimum = Minval(EVM);
        int MinIndex = Minindex(EVM);
        System.out.println(); //Printing the Empty Line
        System.out.println("The candidate " + MinIndex + ": Got the Minimum votes which are : " + Minimum);

        /*Now asking the user that after knowing that which candidate Got the Minimum. From that Minimum
        votes the single transferable voting system the votes will going to transfer to other candidates.
        so we are just asking who Got, How much votes*/
        int indexToRemove = MinIndex;

        EVM = removeElement(EVM, indexToRemove);
        System.out.println("Updated list after removing the candidate who got the least votes : ");
        for (int i = 0; i < EVM.length; i++) {
            System.out.println("Candidate " + (i + 1) + ": " + EVM[i] + " Votes");
        }
        // Taking Input of who Got the second preference votes
        System.out.println(); //Printing the Empty Line
        System.out.println("Now Taking Input of who Got the second preference votes...");
        System.out.println(); //Printing Empty Line

        for (int i = 0; i < EVM.length; i++) {
            System.out.println("How much vote Candidate " + (i + 1) + ": Got of the second preference of candidate [" +
                    (MinIndex + 1) + "] (Index before updated array) Voters :- ");

            int UpdatedCandidate = sc.nextInt();

            // Adding the second preferential votes
            EVM[i] += UpdatedCandidate;
            System.out.println("After adding the preferential votes in candidate [" + (i + 1) + "] : " + EVM[i]);
        }
        // check if any candidate meet the Quota
        for (int i = 0; i < EVM.length; i++) {
            if (EVM[i] >= Quota) {
                System.out.println("Candidate " + (i + 1) + ": Won the election with a Majority Quota of [" + EVM[i] +
                        "] Which is [" + (EVM[i] - Quota) + "] more than the actual Quota.");
                return;
            }
        }
        //If the Quota does not meet in the second round of counting then move on to the Third round of counting
        // The Third round of counting starts from here

        System.out.println(); //Printing the Empty Line
        System.out.println("THIRD ROUND OF COUNTING....");
        System.out.println(); //Printing the Empty Line

        for(int i = 0; i < EVM.length; i++){
            System.out.println("Candidate " + (i + 1) + ": " + EVM[i] + " Votes");
        }
        System.out.println(); //Printing the Empty Line
        Minimum = Minval(EVM);
        MinIndex = Minindex(EVM); //Recalculate the minimum index for the updated EVM array
        System.out.println("The Candidate (" + (MinIndex + 1) + ") Got the Minimum votes which are : " + Minimum);

        System.out.println(); //Printing the Empty Line
        EVM = updateAndPrintEVM(EVM, MinIndex);

        //Taking Input of who Got the Third preference votes
        System.out.println(); //Printing the Empty Line
        System.out.println("Taking Input Of Preferential Votes...");
        for(int i = 0; i < EVM.length; i++) {
            System.out.println(); //Printing the Empty Line
            System.out.println("Candidate " + (i + 1) + ": received Second Preference votes from the removed Candidate " +
                    "(" + (MinIndex + 1) + ") [Index before updated array Voters? :- ");

            //Taking Input for second preference [Third Round Of Counting]
            int UpdatedThirdCandidate = sc.nextInt();

            /* For Example :- Suppose in the second round of counting of votes the candidate (D) Got the least votes
             * which are (27) so breakdown of these votes is something like that :- Candidate (D) Got the First
             * preference votes which are : (20) and in that (7) votes are second preferential votes added to
             * Candidate (D) in second round of counting from the least removed votes of first round of counting*/

            System.out.println("Candidate " + (i + 1) + ": received Third Preference votes form second preference " +
                    "voters of candidate (" + (MinIndex + 1) + ") [Index before updated array of Voters] :- ");

            //Taking Input for Third Preference [Third Round Of Counting]
            int ThirdPreference = sc.nextInt();

            // Adding the second preferential votes of who got the least votes after completing the Second Round Of
            // counting And
            /*Adding the Third Preferential votes of the removed candidate ( These votes are those votes which was added
             in the second round of counting by removing the votes of who got the least votes in the first round of
              counting*/

            EVM[i] += (UpdatedThirdCandidate + ThirdPreference);
            System.out.println("After adding the Preferential  votes in candidate [" + (i + 1) + "] : " + EVM[i]);
        }
        System.out.println(); //Printing the Empty Line
        //Check if any candidate meet the Quota
        for(int i = 0; i< EVM.length; i++){
            if(EVM[i] >= Quota){
                System.out.println("Candidate " + (i + 1 + ": Won the election with Majority Quota of [" + EVM[i] + "]" +
                        " Which is (" + (EVM[i] - Quota) + ") more than the actual Quota."));
                return;
            }
        }
        sc.close();
    }

    // This function will call updated array and take a index to Remove
    public static int[] updateAndPrintEVM(int[] EVM, int indexToRemove) {
        EVM = removeElement(EVM, indexToRemove);
        System.out.println("Updated list after removing the Minimum : ");
        for (int i = 0; i < EVM.length; i++) {
            System.out.println("Candidate " + (i + 1) + ": " + EVM[i] + " Votes");
        }
        return EVM;
    }

    // Removing the MinVal index for second round of counting
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

    // finding which candidate got the minimum votes [MINIMUM votes finding Method]
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

    // Finding which candidate's Index got the minimum votes [Minimum Index finding method]
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

    // Method to collect votes for each candidate
    static int[] EVMmachine(int Candidates) {
        Scanner sc = new Scanner(System.in);
        int[] votes = new int[Candidates];
        String[] Names = new String[Candidates];

        for (int i = 0; i < Candidates; i++) {
            System.out.print("Enter the Name of the Candidate : ");
            Names[i] = sc.nextLine();
            System.out.print("Now Enter How many vote " + Names[i] + " Got : ");
            votes[i] = sc.nextInt();
            sc.nextLine();
        }
        return votes;
    }

    // Method to get the number of MLAs for a given state name
    public static int StateNames(int[] StatesMLA) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Name Of This State : ");
        String states = sc.nextLine().toUpperCase();

        int mlaCount = 0;

        // Match state name to the corresponding number of MLAs
        switch (states) {
            case "ANDHRA PRADESH" -> mlaCount = StatesMLA[0];
            case "ARUNACHAL PRADESH" -> mlaCount = StatesMLA[1];
            case "ASSAM" -> mlaCount = StatesMLA[2];
            case "BIHAR" -> mlaCount = StatesMLA[3];
            case "CHHATTISGARH" -> mlaCount = StatesMLA[4];
            case "GOA" -> mlaCount = StatesMLA[5];
            case "GUJARAT" -> mlaCount = StatesMLA[6];
            case "HARYANA" -> mlaCount = StatesMLA[7];
            case "HIMACHAL PRADESH" -> mlaCount = StatesMLA[8];
            case "JHARKHAND" -> mlaCount = StatesMLA[9];
            case "KARNATAKA" -> mlaCount = StatesMLA[10];
            case "KERALA" -> mlaCount = StatesMLA[11];
            case "MADHYA PRADESH" -> mlaCount = StatesMLA[12];
            case "MAHARASHTRA" -> mlaCount = StatesMLA[13];
            case "MANIPUR" -> mlaCount = StatesMLA[14];
            case "MEGHALAYA" -> mlaCount = StatesMLA[15];
            case "MIZORAM" -> mlaCount = StatesMLA[16];
            case "NAGALAND" -> mlaCount = StatesMLA[17];
            case "DELHI" -> mlaCount = StatesMLA[18];
            case "ODISHA" -> mlaCount = StatesMLA[19];
            case "PUDUCHERRY" -> mlaCount = StatesMLA[20];
            case "PUNJAB" -> mlaCount = StatesMLA[21];
            case "RAJASTHAN" -> mlaCount = StatesMLA[22];
            case "SIKKIM" -> mlaCount = StatesMLA[23];
            case "TAMIL NADU" -> mlaCount = StatesMLA[24];
            case "TELANGANA" -> mlaCount = StatesMLA[25];
            case "TRIPURA" -> mlaCount = StatesMLA[26];
            case "UTTAR PRADESH" -> mlaCount = StatesMLA[27];
            case "UTTARAKHAND" -> mlaCount = StatesMLA[28];
            case "JAMMU & KASHMIR" -> mlaCount = StatesMLA[29];
            case "WEST BENGAL" -> mlaCount = StatesMLA[30];
            default -> System.out.println("Enter a valid state name");
        }

        // Print the total MLAs of the state if valid
        if (mlaCount > 0) {
            System.out.println("Total MLA's Of " + states + ": " + mlaCount);
        }
        return mlaCount;
    }
}
