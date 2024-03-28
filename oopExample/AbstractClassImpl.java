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
public class AbstractClassImpl extends AbstractClassTest {

    int test = getA();

    public AbstractClassImpl(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public int displaySum(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public void showResult() {
        super.showResult(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public static void main(String[] args) {
        AbstractClassTest extendedObj = new AbstractClassImpl(1, 2, 3);
        extendedObj.showResult();
        System.out.println("VALUES " + extendedObj.displaySum(1, 1, 1));
    }

    @Override
    public int displaySum2(int a, int b, int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
