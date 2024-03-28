/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapAndSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Binam Pokharel
 */
public class SetOperationExample {
     public static void main(String args[])    
    {    
        Integer[] A = {22, 45,33, 66, 55, 34, 77};  
        Integer[] B = {33, 2, 83, 45, 3, 12, 55}; 
        
        Set<Integer> set1 = new HashSet<>();    
        set1.addAll(Arrays.asList(A));   
        
        Set<Integer> set2 = new HashSet<>();    
        set2.addAll(Arrays.asList(B));    
    
        // Finding Union of set1 and set2   
        Set<Integer> union_data = new HashSet<>(set1);    
        // set1 after add all on set2 -> set1 U set2
        union_data.addAll(set2);    
        System.out.print("Union of set1 and set2 is:");    
        System.out.println(union_data);    
    
        // Finding Intersection of set1 and set2    
        Set<Integer> intersection_data = new HashSet<>(set1);    
        intersection_data.retainAll(set2);    
        System.out.print("Intersection of set1 and set2 is:");    
        System.out.println(intersection_data);    
    
        // Finding Difference of set1 and set2    
        Set<Integer> difference_data = new HashSet<>(set1);    
        difference_data.removeAll(set2);    
        System.out.print("Difference of set1 and set2 is:");    
        System.out.println(difference_data);    
    }     
}
