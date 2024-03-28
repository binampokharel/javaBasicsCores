/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringPool;

/**
 *
 * @author Binam Pokharel
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        String firstVariable = "first";
        firstVariable.concat("Concat me");
        System.out.println("firstVariable "+firstVariable);
        System.out.println("*********************************");
        
        StringBuffer strBuffer = new StringBuffer("Hello");
        strBuffer.append("Class");
        System.out.println("firstVariable "+strBuffer);
        
                System.out.println("*********************************");


        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("TEST");
        strBuilder.append("Example");
        System.out.println("firstVariable "+strBuilder);
                System.out.println("*********************************");

       
        String finalResultStringBuffer = strBuffer.toString(); //important
        String finalTest = strBuilder.toString(); //important
        
        System.out.println("finalResultStringBuffer "+finalResultStringBuffer);
        System.out.println("finalTest "+finalTest);
        
                        System.out.println("*********************************");

        String concat1 = "concat";
        String concat2 = concat1+ "concat1";
        
        System.out.println("concatedVariable "+concat2);
        
        

    }
}
