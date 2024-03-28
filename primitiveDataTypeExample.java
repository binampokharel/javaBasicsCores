/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Binam Pokharel
 */
public class primitiveDataTypeExample {
    
  public static void main(String[] args) {
        int myNumber = 42;
        System.out.println("Before: " + myNumber);

        modifyNumber(myNumber);

        System.out.println("After: " + myNumber);
    }

    static void modifyNumber(int number) {
        number = number+2;
        System.out.println("Number "+number);
    }
}
