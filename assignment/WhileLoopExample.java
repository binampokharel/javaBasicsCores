/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Binam Pokharel
 */
public class WhileLoopExample {
    public static void main(String[] args) {
        int i =1;
        System.out.println("The even numbers are: ");
        while(i<10){
            if(i%2==0){
                System.out.println(""+i);
            }
            i++;
        }
    }
}
