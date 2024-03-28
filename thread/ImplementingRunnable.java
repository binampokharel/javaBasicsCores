/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Binam Pokharel
 */
public class ImplementingRunnable implements Runnable {

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        ImplementingRunnable m1 = new ImplementingRunnable();
        Thread t1 = new Thread(m1);   // Using the constructor Thread(Runnable r)  
        t1.start();
    }
}
