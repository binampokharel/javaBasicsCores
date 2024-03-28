/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Binam Pokharel
 */
public class TypecastingExample {
    public static void main(String[] args) {
        int myNum = 20;
        double myNumAfterWidening = myNum;
        
        System.out.println("Example of Narrowing Casting");
        double myNumIndouble = 20.5;
        int myNumAfterNarrowing = (int) myNumIndouble;
        
        System.out.println("myNumAfterNarrowing: "+myNumAfterNarrowing);
        
    }
    
}
