/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionInJava;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Binam Pokharel
 */
public class ThrowAndThrowsExample {
    //declare exception using throws in the method signature

    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    void testMethod(int num) throws IOException, ArithmeticException {
        if (num == 1) {
            throw new IOException("IOException Occurred");
        } else {
            throw new ArithmeticException("ArithmeticException");
        }
    }

    public static void main(String args[]) {
        try {
            //this try block calls the above method so handle the exception
            ThrowAndThrowsExample obj = null;
            obj.setVal(1);
            obj.testMethod(1);
        } catch (IOException | ArithmeticException ex) {
            System.out.println(ex);
        }
    }

}
