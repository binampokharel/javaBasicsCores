/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalsAndHashMethod;

/**
 *
 * @author Binam Pokharel
 */
import java.util.Objects;

public class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters...
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;

        // Compare id and name for equality
        return id == person.id
                && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person(1, "John");
        Person person2 = new Person(1, "John");
        Person person3 = new Person(1, "Ram");
        Example person4 = new Example(1, "John");

        boolean areEqual = person2.equals(person3);
        System.out.println("Are person2 and person3 equal? " + areEqual);

   //    if (obj == null || getClass() != obj.getClass()) return false;
        boolean isExampleClassEqual = person2.equals(person4);
        System.out.println("Are person2 and person4 equal? " + isExampleClassEqual);


        // Using equals() for content-based comparison
        if (person1.equals(person2)) {
            System.out.println("The persons are equal based on content.");
        } else {
            System.out.println("The persons are not equal based on content.");
        }

        // Using hashCode() for hash-based data structures
        System.out.println("HashCode for person1: " + person1.hashCode());
        System.out.println("HashCode for person2: " + person2.hashCode());
    }
}
