/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentVerify;

import java.util.Scanner;

/**
 *
 * @author Binam Pokharel
 */
 //Perform user defined operation on given two numbers using sw itch.

// #WAP in Java to use switch statements where,
// 1. The user will provide two numbers as input and store them in inputFirstNumber, and inputSecondNumber
// 2. The user will declare add/subtract/multiply/divide to be performed and will use the inputByUser variable to assign the desired input to be performed
// 3. Based on the conditions 1 and 2
// 4. The program should be able to return add/subtract/multiply/divide of two numbers
// 5. If add/subtract/multiply/divide none of this is asked by the user then no operation is required to be performed.
// 6. After the operation is performed, the end user should know what was the operation performed by the user and its result.

// Example, if the user wants to perform an add operation where the input Numbers are inputFirstNumber=10 and inputSecondNumber=5; The print statement should be displayed as ;

// SUM: 15.0
// Task: add Operation Was Successful

// for no operation following should be printed:
// Task: none Operation Was Successful

public class SwitchStatementWithConstructorSuresh{
     static double inputFirstNumber = 10;
    static double inputSecondNumber = 5;
    public static void main(String[] args) {
        //System.out.println(inputFirstNumber+" "+ inputSecondNumber);

        String userDeclare ="aaaa";
        double result=0;

        switch (userDeclare){
            case "add":
                result = inputFirstNumber+inputSecondNumber;
                System.out.println(result);
                System.out.println("Task: add Operation Was Successful");
                break;
            case "subtract":
                result = inputFirstNumber-inputSecondNumber;
                System.out.println(result);
                System.out.println("Task: subtract Operation Was Successful");
                break;
            case "multiply":
                result = inputFirstNumber*inputSecondNumber;
                System.out.println(result);
                System.out.println("Task: multiply Operation Was Successful");
                break;
            case "divide":
                result = inputFirstNumber/inputSecondNumber;
                System.out.println(result);
                System.out.println("Task: divide Operation Was Successful");
                break;
            default:
                System.out.println("Task: none Operation Was Successful");

        }
    }

}
