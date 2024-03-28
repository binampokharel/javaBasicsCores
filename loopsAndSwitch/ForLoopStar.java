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

//******
//*****
//****
//***
//**
//*
public class ForLoopStar {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            for (int j = i; j >=0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
