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
public class EncapsulationClassImpl {
    public static void main(String[] args) {
        EncapsulationClass enc = new EncapsulationClass();
        
        enc.setName("John");
        enc.setAge(30);
 
        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + enc.getName());
        System.out.println("Age: " + enc.getAge());
    
    }
}
