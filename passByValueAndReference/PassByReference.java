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
class PassByReferenceExampleClass {
    private int value;

    public PassByReferenceExampleClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
   
}

public class PassByReference {
     public static void main(String[] args) {
        PassByReferenceExampleClass originalObject = new PassByReferenceExampleClass(10);
//        PassByReferenceExampleClass originalObject = new PassByReferenceExampleClass(10);
        System.out.println("Original value before method call: " + originalObject.getValue());
        modifyObjectValue(originalObject);
        System.out.println("Original value after method call: " + originalObject.getValue());
    }

    public static void modifyObjectValue(PassByReferenceExampleClass obj) {
        obj.setValue(20);  // Changes the content of the original object.
        System.out.println("Value inside method: " + obj.getValue());
    }
}

