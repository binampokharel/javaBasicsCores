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
public interface MarksCalculatorInterface {
    public String printResultMessage(boolean result);
    public double finalMarks(double marks1,double marks2,double marks3,double marks4);
    public double calculatePercentage(double obtainedMarks,double total);
}
