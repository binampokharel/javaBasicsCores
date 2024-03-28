/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysInJava;

/**
 *
 * @author Binam Pokharel
 */
public class SingleDimension {
     void msg(){System.out.println("Hello");}  
    public void example(){System.out.println("Hello");}  
    protected void exampleOfProtected(){System.out.println("Hello");}  
    public static void main(String[] args) {
        //array index out of bound error
String[] cars = new String[2];
cars[0] = "Volvo";
cars[1] = "BMW";
cars[3] = "car";

System.out.println(cars[0]); // Output: Volvo
System.out.println(cars[1]); // Output: BMW

//BASIC EXAMPLE
//String countries[] = {"US","UK","Canada","Australia","Nepal"};
//        System.out.println("First country "+countries[0]);
//        System.out.println("First country "+countries[1]);
//        System.out.println("First country "+countries[2]);
//        System.out.println("First country "+countries[3]);
    }
}
