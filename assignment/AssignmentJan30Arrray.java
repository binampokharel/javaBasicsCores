/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Arrays;

/**
 *
 * @author Binam Pokharel
 */
//2. WAP in Java to sort the array containing games   
//games = {"Cricket","Basketball","Football","Badminton","Tennis"}; 
public class AssignmentJan30Arrray {
    public static void main(String[] args) {
           // Adding String values  
           String[] games = {"Cricket","Basketball","Football","Badminton","Tennis"};  
           // Print Original values   
           System.out.println("Entered Sports: "+Arrays.toString(games));  
            Arrays.sort(games); // Sorting Elements  
           // Print Sorted Values  
            System.out.println("Sorted Sports: "+Arrays.toString(games));  
    }
}
