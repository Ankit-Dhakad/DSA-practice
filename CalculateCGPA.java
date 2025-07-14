//Q. Calculate CGPA java Program

import java.util.Scanner;
public class CalculateCGPA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Entering the n that how much is loop going to run
        System.out.print("How many subjects do you have in all semester : ");
        double SubjectN = sc.nextDouble();
        // Initializing the Credit
        double credit = 0;
        double sum = credit;
        // Initializing the Grade Point
        double GradePoint = 0;
        //Initializing the Score
        double Score = 0;
        // For adding in itself or For getting Total
        double sumG = Score;
        for (int i = 1; i <= SubjectN; i++) {
            System.out.print("Enter the Credit Of the subject : ");
            // Input the Credit
            credit = sc.nextInt();
            System.out.print("Enter the Grade Point of the subject : ");
            // Input the Grade Point
            GradePoint = sc.nextInt();

            // Calculating the Score
            Score = credit * GradePoint;
            // For adding in itself or For getting Total Credit
            sum = sum+credit;
            // For adding in itself or For getting Total Score
            sumG = sumG+Score;
        }
        // Calculating the CGPA
        double CGPA = sumG/sum;
        System.out.println("Your CGPA is : " + CGPA);
    }
}
