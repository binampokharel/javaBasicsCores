/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import schoolManagement.Student;

/**
 *
 * @author Binam Pokharel
 */

//#WAP to calculate marks obtained by Student in 3 subjects- Math,Science,English, calculate percentage,calculate average, and grade them as:
//if total mark less than 30, F
//if total mark greater than 30, A
//if total mark greater than 50 , A+
//if total mark greater than 80, A++
//
//- Use getter and setter method for storing and retrieving value from Student class(make this class separate)
//- use Interface for methods calculate percentage,calculate average, and calculate grade 
//- Make a validation such that marks for each subject should not be 0 and total mark should not exceed 200.
//- Also print the current date in mm/dd/yyyy format
//- Use enum to store Grade details
//- The message should also be printed as 
//if grade is F then-> Sorry!!! you are fail,
//for other grades-> Congratulations you are passed!!
//
//The output should be:
//Result information by date : 16/02/2024 for Ram in kindergarten(this should be the school where Ram studies)  is :
//
//Marks obtained in Math : 20
//Marks obtained in Science : 20
//Marks obtained in English : 50
//
//Total Marks Obtained : 90
//Total Average : 30
//Grade Obtained :  A++
//
//Congratulations you are passed!!
public class AssignmentFeb16 extends AssignmentFeb16Student {

    public static void main(String[] args) {

        final double ASSIGNMENT_ONE_MARK = 20;
        final double ASSIGNMENT_TWO_MARK = 30;
        final double ASSIGNMENT_THREE_MARK = 50;

        Scanner inText = new Scanner(System.in);    // Scanner object for reading text
        Scanner inNumber = new Scanner(System.in);    // Scanner object for reading numbers
        Scanner inAssignmentMark2 = new Scanner(System.in);    // Scanner object for reading numbers
        Scanner inFinalAssignmentMark = new Scanner(System.in);    // Scanner object for reading numbers

        final int N = 2;    // constant N which is the highest digit in my student ID

        double charge = 0.0;

        String studentName;
        String studentId;
        int mark = 0;
        int assignmentMark1 = 0;
        int assignmentMark2 = 0;
        int finalAssignmentMark = 0;

        final int MIN_MARK = 0;

        int minimumMark = Integer.MAX_VALUE;
        String minimumStudentName = "";
        int maximumMark = Integer.MIN_VALUE;
        String maximumStudentName = "";
        int finalValue = 0;
        List<AssignmentFeb16Student> st = new ArrayList<>();

        // print welcome message
        System.out.println("Welcome to COIT20245 grading system\n\n");

        // read in N orders
        for (int i = 0; i < N; i++) {
            System.out.print("Please enter the student name " + (i + 1) + " ==> ");
            studentName = inText.nextLine();
            while (studentName.equals("")) // validation loop
            {
                System.out.println("ERROR student name cannot be blank");
                System.out.print("Please enter the student name " + (i + 1) + " ==> ");
                studentName = inText.nextLine();
            }

            System.out.print("Please enter student number " + studentName + " ==> ");
            studentId = inText.nextLine();
            while (studentId.equals("")) // validation loop
            {
                System.out.println("ERROR student number cannot be blank");
                System.out.print("Please enter student number " + (i + 1) + " ==> ");
                studentId = inText.nextLine();
            }

            System.out.print("Please enter assignment one mark of " + studentName + " ==> ");
            assignmentMark1 = inNumber.nextInt();

            //assignment1 should be less than 0 and greater than 20 [0-20]
            if (assignmentMark1 < MIN_MARK || assignmentMark1 > ASSIGNMENT_ONE_MARK) // validation loop
            {
                System.out.println("ERROR Assignment one mark need to be in the range of " + MIN_MARK + " and " + ASSIGNMENT_ONE_MARK);
                System.out.print("Please enter assignment one mark of " + studentName + " ==> ");
                assignmentMark1 = inNumber.nextInt();
            }
            System.out.println("assignmentMark1 is " + assignmentMark1);

            System.out.print("Please enter assignment two mark of " + studentName + " ==> ");
            assignmentMark2 = inAssignmentMark2.nextInt();

            //20>30
            System.out.println(assignmentMark2 + " less than" + ASSIGNMENT_TWO_MARK + " greatrer " + ASSIGNMENT_ONE_MARK);
            if (assignmentMark2 < ASSIGNMENT_ONE_MARK || assignmentMark2 > ASSIGNMENT_TWO_MARK) // validation loop
            {
                System.out.println("ERROR Assignment two mark need to be in the range of " + ASSIGNMENT_ONE_MARK + " and " + ASSIGNMENT_TWO_MARK);
                System.out.print("Please enter assignment two mark of " + studentName + " ==> ");
                assignmentMark2 = inAssignmentMark2.nextInt();
            }
            System.out.println("assignmentMark2 is " + assignmentMark2);

            System.out.print("Please enter final assignment  mark of " + studentName + " ==> ");
            finalAssignmentMark = inFinalAssignmentMark.nextInt();

            //30>50
            if (finalAssignmentMark < ASSIGNMENT_TWO_MARK || finalAssignmentMark > ASSIGNMENT_THREE_MARK) // validation loop
            {
                System.out.println("ERROR final Assignment mark need to be in the range of " + ASSIGNMENT_TWO_MARK + " and " + ASSIGNMENT_THREE_MARK);
                System.out.print("Please enter assignment final mark of " + studentName + " ==> ");
                finalAssignmentMark = inFinalAssignmentMark.nextInt();
            }
            System.out.println("finalAssignmentMark is " + finalAssignmentMark);

            int totalMarks = assignmentMark1 + assignmentMark2 + finalAssignmentMark;
            String grade = "";
            if (totalMarks < 50) {
                grade = "F";
            } else if (totalMarks >= 50 && totalMarks < 65) {
                grade = "P";
            } else if (totalMarks >= 65 && totalMarks < 75) {
                grade = "C";
            } else if (totalMarks >= 75 && totalMarks < 85) {
                grade = "D";
            } else {
                grade = "HD";
            }
            System.out.println("The grade of " + studentName + " with student number "
                    + studentId + " is : " + grade + " with total marks of " + totalMarks);
            st.add(new AssignmentFeb16Student(studentName, studentId, totalMarks));
        }
        double starter = 0;
        double starterForLow = Integer.MAX_VALUE;
        double winner = 0;
        String winnerName = "";
        double loser = 0;
        String loserName = "";
        double totalAll = 0;
        for (AssignmentFeb16Student s : st) {
            System.out.println("s" + s.name);
            System.out.println("s" + s.totalMarks);
        }
        for (AssignmentFeb16Student s : st) {
            if (s.totalMarks > starter) {
                winnerName = s.name;
                winner = s.totalMarks;
                starter = s.totalMarks;
            }

            if (s.totalMarks < starterForLow) {
                loserName = s.name;
                loser = s.totalMarks;
                starterForLow = s.totalMarks;
            }

            totalAll += s.totalMarks;
        }

        // print statistical information
        System.out.println("\n\nStatistical information of COIT20245 Grading System\n");
        System.out.println(loserName + " has the minimum number of "
                + loser + " mark");
        System.out.println(winnerName + " has the maximum number of " + winner
                + " mark");
        System.out.println("The avg marks is: " + totalAll / N);

        // print end message
        System.out.println("\n\nThank you for using COIT20245 Grading System");
        System.out.println("Program written by 12345678\n");

    }

    public AssignmentFeb16(String name, String studentNumber, double totalMarks) {
        super(name, studentNumber, totalMarks);
    }

}
