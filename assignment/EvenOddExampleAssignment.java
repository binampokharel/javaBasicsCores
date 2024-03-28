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
public class EvenOddExampleAssignment {
    public static void main(String[] args) {
        int i = 2;
        if(EvenOddStatic.checkEvenAndOdd(i)){
            System.out.println(i+ " is even number");
        }else{
               System.out.println(i+ " is odd number");
        }
    }
    
}
