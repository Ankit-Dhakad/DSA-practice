/*Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades
according to the marks entered as below:

Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
*/






package Functions;

import java.util.Scanner;
public class GradeFunction {
    public static void main(String[] args) {

//        Calling the Function
        int marks = 0;
        grade(marks);
    }

    static void grade(int marks){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many subjects you have : ");
        int totalSubjects = sc.nextInt();

//        Calculating overall sum of subjects
        int MaxTotal = totalSubjects * 100;
        int sum = marks;

        for(int i = 0; i <= totalSubjects-1; i++){
            System.out.print("Enter the Subject Marks : ");

//            Getting input that How many marks student got in each subject
            marks = sc.nextInt();

//            Calculating the total marks from overall marks basically sum of all marks that student got
            int temp = marks;
            sum = sum + temp;
        }
//        assigning the Grade points according to the question

        int percentage = (sum * 100)/MaxTotal;
        if(percentage >= 91 && percentage <= 100){
            System.out.println("Grade :- AA");
        }else if(percentage >= 81 && percentage <= 90){
            System.out.println("Grade :- AB");
        }else if(percentage >= 71 && percentage <= 80){
            System.out.println("Grade :- BB");
        }else if(percentage >= 61 && percentage <= 70){
            System.out.println("Grade :- BC");
        }else if(percentage >= 51 && percentage <= 60){
            System.out.println("Grade :- CD");
        }else if(percentage >= 41 && percentage <= 50){
            System.out.println("Grade :- DD");
        }else if(percentage <= 40){
            System.out.println("Fail");
        }
    }
}
