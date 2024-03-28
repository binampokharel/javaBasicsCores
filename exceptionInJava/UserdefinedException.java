/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionInJava;

/**
 *
 * @author Binam Pokharel
 */
public class UserdefinedException extends Exception {

    public static void main(String args[]) {
        try {
            // Throw an object of user defined exception
            throw new UserdefinedException();
        } catch (UserdefinedException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
