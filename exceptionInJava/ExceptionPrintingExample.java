/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionInJava;

/**
 *
 * @author Binam Pokharel
 */
public class ExceptionPrintingExample {

    public static void main(String[] args) {
        //getMessage() 
        //prints only the description of the exception.
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

//        toString() 
//Name of the exception: description of the exception
//        int c = 5;
//        int d = 0;
//        try {
//            System.out.println(c / d);
//        } catch (ArithmeticException e) {
//            System.out.println(e.toString());
//        }
        //printStackTrace()
        //Name of the exception: description of the exception, stack trace
//        int g = 5;
//        int h = 0;
//        try {
//            System.out.println(g / h);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
    }

}
