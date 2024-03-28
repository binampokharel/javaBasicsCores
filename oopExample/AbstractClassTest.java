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
public abstract class AbstractClassTest {
    private int a=2;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public AbstractClassTest(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public abstract int displaySum(int a, int b, int c);
    public abstract int displaySum2(int a, int b, int c);
    
    public void showResult(){
        System.out.println("HELLO RESULT");
    }
    
}
