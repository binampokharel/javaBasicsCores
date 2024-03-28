/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopExample;

/**
 *
 * @author Binam Pokharel
 */
public class EncapsulationClass {
    private String name;
    private int age;
    public int number;
    private int nonPublic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNonPublic() {
        return nonPublic;
    }

    public void setNonPublic(int nonPublic) {
        this.nonPublic = nonPublic;
    }
    
 
   }
