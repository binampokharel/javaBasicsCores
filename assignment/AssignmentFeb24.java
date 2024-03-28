/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Binam Pokharel
 */

//WAP in Java to take the information of students (age, name,class) and displays:
//Ask the user to provide info on total user the user wants to insert record. The validation must be number should be greater than 0 and less than 5.
//--list of student name in ascending order,
//--display the student having highest age,
//-- and display the students info.
//Use try catch block to handle the exception
// -- if user inserts the total number of student to insert as text like : a,b,c, the program should handle exception and ask user to insert new number again:
//Example-
//
//Enter Number of Student to insert: 
//a
//Please enter number in this field to continue
//2
//
//-- for other exceptions in the later block of age/name/class, just keep the exception message simple like "Some Error Occurred"
//
//if there exists no exception/error the program should function in this way;
//
//Enter Number of Student to insert: 
//3
//Please insert info for 3 students below 
//Enter Name of Student
//Ram
//Enter Age of Student
//25
//Enter Class of stduent
//8
//----- Record Inserted ---- 
//Enter Name of Student
//Shyam
//Enter Age of Student
//29
//Enter Class of stduent
//10
//----- Record Inserted ---- 
//Enter Name of Student
//Rita
//Enter Age of Student
//33
//Enter Class of stduent
//12
//----- Record Inserted ---- 
//Student Name In Ascending Order: 
//Ram
//Rita
//Shyam
//Student: Rita has the higest age: 33
//Student Info: [StudentClassForAssignmentFeb24{age=25, name=Ram, className=8}, StudentClassForAssignmentFeb24{age=33, name=Rita, className=12}, StudentClassForAssignmentFeb24{age=29, name=Shyam, className=10}]
public class AssignmentFeb24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStudent = 0;
        try {
            System.out.println("Enter Number of Student to insert: ");
            totalStudent = sc.nextInt();
            if (totalStudent <= 0 || totalStudent > 5) {
                System.out.println("Total Number of Student to insert should be greater than 0 and less than 5");
                System.out.println("Enter Number of Student to insert Again: ");
                totalStudent = sc.nextInt();
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter number in this field to continue");
            Scanner sc2 = new Scanner(System.in);
            totalStudent = sc2.nextInt();
        }
        System.out.println("Please insert info for " + totalStudent + " students below ");
        int highestAge = 0;
        List<StudentClassForAssignmentFeb24> collOfStudent = new ArrayList<>();
        try {
            for (int i = 0; i < totalStudent; i++) {

                Scanner scTxt = new Scanner(System.in);
                Scanner scNum = new Scanner(System.in);

                System.out.println("Enter Name of Student");
                String name = scTxt.nextLine();
                String nameInCapital = StringUtils.capitalize(name);

                System.out.println("Enter Age of Student");
                int age = scNum.nextInt();

                System.out.println("Enter Class of stduent");
                int className = scNum.nextInt();

                StudentClassForAssignmentFeb24 studentInfo = new StudentClassForAssignmentFeb24(age, nameInCapital, className);
                collOfStudent.add(studentInfo);
                System.out.println("----- Record Inserted ---- ");
            }
            Collections.sort(collOfStudent,
                    Comparator.comparing(StudentClassForAssignmentFeb24::getName));

            System.out.println("Student Name In Ascending Order: ");

            for (StudentClassForAssignmentFeb24 student : collOfStudent) {
                System.out.println("" + student.getName());
            }

            String studentWithHighestAge = "";
            for (StudentClassForAssignmentFeb24 s : collOfStudent) {
                if (s.getAge() > highestAge) {
                    studentWithHighestAge = s.getName();
                    highestAge = s.getAge();
                }
            }
            System.out.println("Student: " + studentWithHighestAge + " has the higest age: " + highestAge);

            System.out.println("Student Info: " + collOfStudent.toString());
        } catch (Exception e) {
            System.out.println("Some Error occurred");
        }
    }

}
