/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapAndSet;

import java.util.HashMap;

/**
 *
 * @author Binam Pokharel
 */
public class HashMMapWithRemove {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.put(103, "Gaurav");
        map.put(102, "Shyam");
        
        System.out.println("Initial list of elements: " + map);
        //key-based removal  
        map.remove(100);
//        System.out.println("Updated list of elements: " + map);
        //value-based removal  
        map.remove(101);
//        System.out.println("Updated list of elements: " + map);
        //key-value pair based removal  
        map.remove(102, "Rahul");
//        System.out.println("Updated list of elements: " + map);
        
        System.out.println("value "+map.get(103));
        
        System.out.println("Default case "+map.getOrDefault(105, "RAM"));

    }
}
