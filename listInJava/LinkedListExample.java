/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listInJava;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Binam Pokharel
 */
public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        Deque<String> linkedList =  new LinkedList<>();

        // Adding elements to the end of the list using add()
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("JavaScript");

        // Printing the LinkedList
        System.out.println("Original LinkedList: " + linkedList);

        // Adding an item to the beginning of the list using addFirst()
        linkedList.addFirst("C++");

        // Adding an item to the end of the list using addLast()
        linkedList.addLast("Ruby");

        // Printing the modified LinkedList
        System.out.println("Modified LinkedList: " + linkedList);

        // Removing the first item using removeFirst()
        linkedList.removeFirst();

        // Removing the last item using removeLast()
        linkedList.removeLast();

        // Printing the LinkedList after removals
        System.out.println("LinkedList after removals: " + linkedList);

        // Getting the first and last elements using getFirst() and getLast()
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();

        // Printing the first and last elements
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
    }
}
