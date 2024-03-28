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
public class ForEachLoopExample {
    
    static String returnConcatenation(){
        return "";
    }
    public static void main(String[] args) {
        String[] sports= {"Football ","Table tenis ","Cricket ","Basketball"};
        Integer[] num= {1,2,3};
        String end = "";
        
//        for (int i = 0; i < sports.length; i++) {
//            System.out.println(""+ sports[i]);
//        }

//sports -> collection of string -> all the parts/elements inside the sports is of String
//
//one element of sport -> one part of string-> single string for printing;
        
        for(String s: sports){
            System.out.println(s);
            end+=s;
        }
        System.out.println("S is "+end);
        

        System.out.println("The elements inside Integer are: ");
        for(Integer i : num){
            System.out.println(""+i);
        }
        
    }
}
