/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Binam Pokharel
 */
public class ArrayListSimple {

    public static void main(String args[]) {
        List<String> list = new ArrayList<>();//Creating arraylist    
        list.add("Mango");//Adding object in arraylist    
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        //Printing the arraylist object   
        list.add(0, "Guava");
        list.add(3, "Guava");
        System.out.println(list);
        

        System.out.println("Using Iterator :");
        //Iterating ArrayList using Iterator
        Iterator itr = list.iterator();//getting the Iterator  
        while (itr.hasNext()) {//check if iterator has the elements  
            System.out.println(itr.next());//printing the element and move to next  
        }

        System.out.println("FOR Each LOOP:");
        //Traversing list through for-each loop  
        for (String fruit : list) {
            System.out.println(fruit);
        }

//      Get and Set ArrayList
        System.out.println("Returning element: " + list.get(1));//it will return the 2nd element, because index starts from 0  
        //changing the element  
        list.set(1, "Dates");

        //Traversing list  
        System.out.println("Changed Elements after using Set: " + list);

        Collections.sort(list);
        System.out.println("After Sort :" + list);

        Collections.sort(list, Collections.reverseOrder());
// Print the sorted ArrayList   
        System.out.println("After Sorting desc: " + list);

        //Sorting using Comparator interface
        list.sort(Comparator.naturalOrder());
        System.out.println("After Sorting with Comparator: " + list);

        //Sorting using Comparator interface desc
        list.sort(Comparator.reverseOrder());

        System.out.println("After Sorting with Comparator DESC: " + list);

        list.remove(1);
        list.remove("Dates");
        System.out.println(list);

        String[] array = {"Java", "Python", "JavaScript", "C#", "Ruby"};
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.addAll(Arrays.asList(array));
        System.out.println("programmingLanguages " + programmingLanguages);
        programmingLanguages.remove(1);
        System.out.println("programmingLanguages " + programmingLanguages);
        programmingLanguages.clear();
        System.out.println("ProgrammingLanguages" + programmingLanguages);
    }

}
