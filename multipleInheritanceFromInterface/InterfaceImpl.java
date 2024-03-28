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
public class InterfaceImpl implements Interface1,Interface2{

    @Override
    public void status() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void methodInInterface2() {
        System.out.println("Hello from Interface2");
    }
    
    @Override
    public void methodInInterface1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sameMethod() {
        Interface1.super.sameMethod(); //To change body of generated methods, choose Tools | Templates.
    }
  
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();
        impl.methodInInterface2();
    }
}
