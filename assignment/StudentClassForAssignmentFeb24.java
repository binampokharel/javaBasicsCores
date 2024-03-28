/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Binam Pokharel
 */
public class StudentClassForAssignmentFeb24 {
    private int age;
    private String name;
    private int className;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }


    
    public StudentClassForAssignmentFeb24(int age, String name, int className) {
        this.age = age;
        this.name = name;
        this.className = className;
    }

    @Override
    public String toString() {
        return "StudentClassForAssignmentFeb24{" + "age=" + age + ", name=" + name + ", className=" + className + '}';
    }
    
}
