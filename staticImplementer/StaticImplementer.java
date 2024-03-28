/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticImplementer;

/**
 *
 * @author Binam Pokharel
 */
public class StaticImplementer {

    public static void main(String[] args) {
        StaticExampleMethod st = new StaticExampleMethod();
        System.out.println("Var2 val" + st.var2);
        System.out.println("Var1 val" + StaticExampleMethod.var1);

        StaticExampleMethod st2 = new StaticExampleMethod();
        System.out.println("Var2 val" + st2.var2);
        System.out.println("Var1 val" + StaticExampleMethod.var1);
    }
}
