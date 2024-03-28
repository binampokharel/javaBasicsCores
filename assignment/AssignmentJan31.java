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

//WAP in java to calculate the simple interest, assume user has Principal=100, Time = 2years and Rate = 2.5. Things to use;
//1. Parameterised constructor to set the value of principal,time and rate
//2. Use get Method to obtain the value while using the formula to obtain simple interest
//3. The formula for simpleInterest is: (principal*time*rate)/100
//
//The console should print the following output for the provided requirement
//    The simpleInterest is: 5.0

public class AssignmentJan31 {
    private double principal;
    private double rate;
    private int time;

    public AssignmentJan31(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public int getTime() {
        return time;
    }
    
    
    public static void main(String[] args) {
        AssignmentJan31 aj = new AssignmentJan31(100, 2.5, 2);
        double simpleInterest = (aj.getPrincipal()*aj.getTime()*aj.getRate())/100;
        System.out.println("The simpleInterest is: "+simpleInterest);
    }
}
