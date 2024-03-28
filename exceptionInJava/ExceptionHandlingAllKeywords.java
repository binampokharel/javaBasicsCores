/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionInJava;

import java.util.Scanner;

/**
 *
 * @author Binam Pokharel
 */
public class ExceptionHandlingAllKeywords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter another number: ");
            int denominator = scanner.nextInt();

            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);

            // This line will be printed if no exception occurs before it.
            System.out.println("This line is printed if no exception occurs.");
        } catch (ArithmeticException e) {
            System.out.println("Error: ");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " );
        } finally {
            System.out.println("This block always executes, whether an exception occurs or not.");
            scanner.close();
        }
    }

    private static int divideNumbers(int numerator, int denominator) throws ArithmeticException {
//        if (denominator == 0) {
//            throw new ArithmeticException("No division by zero is possible");
//        }
        return numerator / denominator;
    }
}
