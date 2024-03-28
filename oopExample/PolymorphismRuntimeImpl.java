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
public class PolymorphismRuntimeImpl {
      public static void main(String[] args)
    {
 
        // Creating object of class 1
        PolymorphismRuntimeParent prp;
 
        // Now we will be calling print methods
        // inside main() method
 
        prp = new PolymorphismRuntimeChild1();
        prp.Print();
 
        prp = new PolymorphismRuntimeChild2();
        prp.Print();
    }
}
