/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Binam Pokharel
 */

//#WAP in Java to use switch statements where,
//1. The user will provide two numbers as input and store them in inputFirstNumber, and inputSecondNumber
//2. The user will declare add/subtract/multiply/divide to be performed and will use the inputByUser variable to assign the desired input to be performed
//3. Based on the conditions 1 and 2
//4. The program should be able to return add/subtract/multiply/divide of two numbers
//5. If add/subtract/multiply/divide none of this is asked by the user then no operation is required to be performed.
//6. After the operation is performed, the end user should know what was the operation performed by the user and its result.
//
//Example, if the user wants to perform an add operation where the input Numbers are inputFirstNumber=10 and inputSecondNumber=5; The print statement should be displayed as ;
//
//SUM: 15.0
//Task: add Operation Was Successful
//
//for no operation following should be printed:
//Task: none Operation Was Successful

public class AssignmenFebt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to reverse: ");
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        System.out.println("Reverse word is: " + sb.toString());

        System.out.println("Enter First Number ");
        double number1 = sc.nextDouble();
        System.out.println("Enter Second Number ");
        double number2 = sc.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Operation to perform ");
        String operation = sc2.nextLine();
        double resultAfterOperation = 0;
        switch (operation.toUpperCase()) {
            case "ADDITION":
                resultAfterOperation = number1 + number2;
                break;
            case "MULTIPLICATION":
                resultAfterOperation = number1 * number2;
                break;
            case "DIVISION":
                resultAfterOperation = number1 / number2;
                break;
            default:
                resultAfterOperation = number1 - number2;
        }
        String usedOperation = operation.length()== 0? "Subtaction" :operation ;
        
        System.out.println("Result with " +usedOperation + " for numbers: " + number1 + " and " + +number2 + " is " + resultAfterOperation);

    }

}
