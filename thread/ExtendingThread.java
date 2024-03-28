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
public class ExtendingThread extends Thread {

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        ExtendingThread t1 = new ExtendingThread();
        t1.start();
    }
}
