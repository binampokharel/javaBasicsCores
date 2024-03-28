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
public class HashMapWithReplace {

    public static void main(String args[]) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        
        System.out.println("Initial list of elements:");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(102, "Gaurav");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(101, "Vijay", "Ravi");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replaceAll((k, v) -> "Ajay");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
