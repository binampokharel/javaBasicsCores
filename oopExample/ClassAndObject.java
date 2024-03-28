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
public class ClassAndObject {
    private int myvar = 2;
    public static void main(String[] args) {
        ClassAndObject c = new ClassAndObject();
        c.myvar = 3;
        System.out.println("myvar "+c.myvar);
    }
}
