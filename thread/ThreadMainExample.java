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
public class ThreadMainExample implements Runnable {

    public void run() {
        // Displaying the thread state
        System.out.println(Thread.currentThread().getName() + " is in " + Thread.currentThread().getState() + " state.");

        // Performing some task
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
