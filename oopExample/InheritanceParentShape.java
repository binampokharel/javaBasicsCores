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
public class InheritanceParentShape {
    private double radius;
    private double length;
    private double width;
    
    public InheritanceParentShape(double radius) {
        this.radius = radius;
    }
    
      public InheritanceParentShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    InheritanceParentShape() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    double calculateAreaOfCircle() {
        return Math.PI*radius*radius;
    }
    double calculateAreaOfRectangle() {
        return length*width;
    }
    
    
    
}
