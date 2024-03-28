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
public class InheritanceMainAreaCalculator {
    
      public static void main(String[] args) {
        InheritanceChild1Rectangle rectangle = new InheritanceChild1Rectangle(5.0, 3.0);
        InheritanceChild2Circle circle = new InheritanceChild2Circle(2.5);
          System.out.println("method from child "+circle.calculateAreaOfCircle());

        // Calculate areas
        double rectangleArea = rectangle.calculateAreaOfRectangle();
        double circleArea = circle.calculateAreaOfCircle();

        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of circle: " + circleArea);
    }
    
}
