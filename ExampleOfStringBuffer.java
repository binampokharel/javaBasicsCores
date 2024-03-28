/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Binam Pokharel
 */
public class ExampleOfStringBuffer {
    public static void main(String[] args) {
        String completeWordResult="";
        String completeWord ="abcdef";
        if(completeWord.contains("a")){
            completeWordResult+="a";
        }if(completeWord.contains("b")){
            completeWordResult+="a";
        }if(completeWord.contains("d")){
            completeWordResult+="d";
        }
        
        System.out.println("completeWordResult: "+completeWordResult);
        String a = "a";
        String b = a+"b";
        String c = b+"c";
                System.out.println("c "+c);

        StringBuilder strB = new StringBuilder("a");
        strB.append("b");
        strB.append("c");
        
        String finalValue = strB.toString();
        System.out.println("finalValue "+finalValue);
    }
    
}
