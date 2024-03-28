/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalsAndHashMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Binam Pokharel
 */
public class HashCodeTester {

    private int id;
    private String name;

    public HashCodeTester(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        HashCodeTester ht = (HashCodeTester) obj;

        // Compare id and name for equality
        return id == ht.id
                && Objects.equals(name, ht.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Map<Person, String> personMap = new HashMap<>();

        Person person1 = new Person(1, "John");
        Person person2 = new Person(1, "John");

        // Adding persons to the map
        personMap.put(person1, "Value for person1");

        // Retrieving value using a different, but equal, person object
        String valueForPerson2 = personMap.get(person2);

        System.out.println("Value for person2: " + valueForPerson2);
    }

}
