/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolManagement;

/**
 *
 * @author Binam Pokharel
 */
public class Student extends School {

    private int id;
    private String name;
    private String roll;
    private double marks;
    private boolean result;
    private String grade;

    public Student(int id, String name, String roll, double marks, boolean result, String address,
            String grade, int schoolId, String schoolName, String schoolAddress) {
        super(schoolId, schoolName, schoolAddress);
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.result = result;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student() {
    }
    
}
