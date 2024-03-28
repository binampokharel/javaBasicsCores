/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapAndSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Binam Pokharel
 */
public class SetBasicExample {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("F");
        s.add("D");
        s.add("B");
        s.add("C");
        s.add("A");
        s.add("D");
        s.remove("C");

        //doesnot maintain insertion order
        Iterator newData = s.iterator();
        System.out.println("The Hashset values are: ");
        while (newData.hasNext()) {
            System.out.println(newData.next());
        }

        //maintains insertion order
        Set<String> s1 = new LinkedHashSet<>();
        s1.add("F");
        s1.add("D");
        s1.add("B");
        s1.add("C");
        s1.add("A");
        s1.remove("C");
        

        Iterator newData2 = s1.iterator();
        System.out.println("The LinkedHashSet values are: ");
        while (newData2.hasNext()) {
            System.out.println(newData2.next());
        }
        
        List<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");
        System.out.println("str "+strList.get(0));
        

    }

}
