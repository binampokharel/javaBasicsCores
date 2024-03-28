/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalsAndHashMethod;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Binam Pokharel
 */
public class ExampleOfHashcodeUse {
     private String name;
    private int age;

    public ExampleOfHashcodeUse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ExampleOfHashcodeUse person = (ExampleOfHashcodeUse) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

   @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
    
    

    public static void main(String[] args) {
        Set<ExampleOfHashcodeUse> personSet = new HashSet<>();
        personSet.add(new ExampleOfHashcodeUse("John", 25));

        // Check if a similar object is present (should return true)
        boolean containsJohn = personSet.contains(new ExampleOfHashcodeUse("John", 25));
        System.out.println("Contains John: " + containsJohn); // Prints: Contains John: false (unexpected result)
    }
}
