/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapAndSet;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author Binam Pokharel
 */
public class NavigableSetExample {
    public static void main(String[] args) {
         
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        // Step 2: Add elements to the TreeSet
        navigableSet.add(1);
        navigableSet.add(3);
        navigableSet.add(5);

        // Step 3: Use NavigableSet methods to navigate the set
        System.out.println("First element: " + navigableSet.first());
        System.out.println("Last element: " + navigableSet.last());
        System.out.println("Lower than 4: " + navigableSet.lower(4));
        System.out.println("Floor of 4: " + navigableSet.floor(4));
        System.out.println("Ceiling of 4: " + navigableSet.ceiling(4));
        System.out.println("Higher than 4: " + navigableSet.higher(4));

    }
}
