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
class Bike {

    void run() {
        System.out.println("running");
    }
}

public class SimpleUpcasting extends Bike {

    @Override
    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]) {
        Bike b = new SimpleUpcasting();//upcasting  
        b.run();
    }
}
