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
public class HashMapWithDifferentAddingMechanism {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        System.out.println("Initial list of elements: " + hm);
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        System.out.println("After invoking put() method ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //If the specified key is not already associated with a value (or is mapped to null) 
        //associates it with the given value and returns null, else returns the current value.
        hm.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //new hash map created
        HashMap<Integer, String> map = new HashMap<>();
        map.put(104, "Ravi");
        //to put map in map
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
