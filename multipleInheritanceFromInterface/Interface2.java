/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleInheritanceFromInterface;

/**
 *
 * @author Binam Pokharel
 */
public interface Interface2 {
        public void status();
        public void methodInInterface2();
          default void sameMethod(){
        System.out.println("Interface2");
    }
}
