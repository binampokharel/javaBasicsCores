/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Binam Pokharel
 */
public class SwitchAssignment {

    public static void addition(double a, double b) {
        double sum = a + b;
        System.out.println("SUM : " + sum);
    }

    public static void subtraction(double a, double b) {
        double subtraction = a - b;
        System.out.println("subtraction : " + subtraction);

    }

    public static void multipliation(double a, double b) {
        double multipliation = a * b;
        System.out.println("multipliation : " + multipliation);
    }

    public static void division(double a, double b) {
        double division = a / b;
        System.out.println("division : " + division);

    }

    public static void main(String[] args) {
        String inputByUser = "aaa";
        double inputFirstNumber = 10;
        double inputSecondNumber = 5;
        String operationByUser = "";
        switch (inputByUser.toLowerCase()) {
            case "add":
                addition(inputFirstNumber, inputSecondNumber);
                operationByUser = "add";
                break;
            case "subtract":
                addition(inputFirstNumber, inputSecondNumber);
                operationByUser = "add";
                break;
            case "multiply":
                addition(inputFirstNumber, inputSecondNumber);
                operationByUser = "add";
                break;
            case "divide":
                addition(inputFirstNumber, inputSecondNumber);
                operationByUser = "add";
                break;
            default:
                operationByUser = "none";

        }
        String finalWord = operationByUser.concat(" Operation Was Successful");
        System.out.println("Task : " + finalWord);
    }

}
