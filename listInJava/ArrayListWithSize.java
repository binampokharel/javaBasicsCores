/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Binam Pokharel
 */
public class ArrayListWithSize {

    public static void main(String[] args) {
        List<Integer> arraySize = new ArrayList<>();
        arraySize.add(1);
        arraySize.add(2);
        arraySize.add(3);
        Iterator i = arraySize.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        arraySize.remove(1);

        List<String> arStr = new ArrayList<>();
        arStr.add("Book");
        arStr.add("Copy");
        arStr.add("pen");

        arStr.remove("Book");
        System.out.println(arStr);
    }

}
