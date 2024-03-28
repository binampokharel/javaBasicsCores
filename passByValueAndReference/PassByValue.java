/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passByValueAndReference;

/**
 *
 * @author Binam Pokharel
 */
public class PassByValue {
        public static void main(String[] args) {
        int originalValue = 10;
        System.out.println("Original value before method call: " + originalValue);
        modifyPrimitiveValue(originalValue);
        System.out.println("Original value after method call: " + originalValue);
    }

    public static void modifyPrimitiveValue(int value) {
        value = 20;  // Changes the local copy of 'value', not the original variable.
        System.out.println("Value inside method: " + value);
    }
}

