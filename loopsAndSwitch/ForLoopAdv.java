/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsAndSwitch;

/**
 *
 * @author Binam Pokharel
 */

//1
//11
//111
//1111
//11111
public class ForLoopAdv {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}
