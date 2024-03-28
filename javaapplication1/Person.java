/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Binam Pokharel
 */
import equalsAndHashMethod.Example;
import java.util.Objects;

/**
 * @param args the command line arguments
 */
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
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        Person person1 = new Person(1, "John");
        Person person4 = person1;

        Person person2 = new Person(1, "John");
        Example person3 = new Example(1, "John");

        // Check if the objects being compared are the same instance (reference equality) has same memory reference,
//        since reference are equal, program won't check further lines
        boolean isReferenceEqual = person1.equals(person4);
        System.out.println("Reference are equal? " + isReferenceEqual);

        // if (obj == null || getClass() != obj.getClass()) return false;
        boolean isExampleEqual = person2.equals(person3);
        System.out.println("Example and person are equal? " + isExampleEqual);

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
