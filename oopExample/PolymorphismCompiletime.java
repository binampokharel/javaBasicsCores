/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopExample;

/**
 *
 * @author Binam Pokharel
 */
public class PolymorphismCompiletime {
     // Method with 2 integer parameters
    static int multiply(int a, int b)
    {
        // Returns product of integer numbers
        return a * b;
    }
    // Method 2
    // With same name but with 2 double parameters
    static double multiply(double a, double b)
    {
        // Returns product of double numbers
        return a * b *0;
    }
    
    static void multiply(float a, float b)
    {
        System.out.println("Addition"+a+b);
    }
   
}
