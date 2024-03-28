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
public class InheritanceChild2Circle extends InheritanceParentShape {
    
    double radius;

    InheritanceChild2Circle(double radius){
        super(radius);
    }

    
    @Override
    double calculateAreaOfCircle() {
        System.out.println("TEST InheritanceChild2Circle");
        return 0; 
    }
    
   
    
}
