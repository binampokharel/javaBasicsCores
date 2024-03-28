/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapAndSet;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Binam Pokharel
 */
public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();//Creating HashMap    
        map.put(1, "Mango");  //Put elements in Map  
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        System.out.println("Iterating Hashmap...");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //if used duplicate key
        map.put(1, "Orange");  //Put elements in Map  
        System.out.println("After dup key...");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("The key set is: " + map.keySet());

        for (Integer m : map.keySet()) {
            System.out.println("simple " + m.intValue());
        }

        map.keySet().forEach((m) -> {
            System.out.println("advanced " + m.intValue());
        });

    }
}
