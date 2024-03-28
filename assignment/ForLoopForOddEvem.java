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
//#WAP in Java to use for loop to check if the number[int the range of 1-10] is odd or even, the odd numbers should be skipped, and only even numbers should be printed[Hint: use continue statement]
//
//Output:
//The even numbers are: 
//2
//4
//6
//8
//

public class ForLoopForOddEvem {
    public static void main(String[] args) {
        System.out.println("The even numbers are: ");
        for (int i = 1; i < 10; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.println(""+ i);
        }
    }
    
}
