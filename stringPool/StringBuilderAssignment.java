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
public class StringBuilderAssignment {
    public static void main(String[] args) {
        String word = "JAVA-CLASS";
        String wordInLowerCase = word.toLowerCase();
        StringBuilder sb = new StringBuilder(wordInLowerCase);
        sb.reverse();
        String splittingTheWord = sb.toString().replace("|","-");
        System.out.println("1.splittingTheWord: "+splittingTheWord);
        String splitterFirst = splittingTheWord.split("-")[0];
        String splitterSecond = splittingTheWord.split("-")[1];
       
        System.out.println("2.splitterFirst: " + splitterFirst);
        System.out.println("3.splitterSecond: "+splitterSecond);
        
         StringBuilder sbFirst = new StringBuilder(splitterFirst);
        StringBuilder sbSecond = new StringBuilder();
        
        String splitterFirstInCorrectOrder =sbFirst.reverse().toString();
        String splitterSecondInCorrectOrder =sbSecond.append(splitterSecond).reverse().toString();
        
        System.out.println("4.splitterFirstInCorrectOrder: " + splitterFirstInCorrectOrder);
        System.out.println("5.splitterSecondInCorrectOrder: "+splitterSecondInCorrectOrder);
        
        StringBuilder sbFinal = new StringBuilder(splitterSecondInCorrectOrder.toUpperCase());
        String finalWord = sbFinal
                .append("_").append(splitterFirstInCorrectOrder.toUpperCase()).toString();
        
        System.out.println("6.final word :"+ finalWord);
        
        
    }
    
}
