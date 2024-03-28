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
public class ConcurrencyProblemInThread extends Thread {

    public static int amount = 0;

    public static void main(String[] args) {
        ConcurrencyProblemInThread thread = new ConcurrencyProblemInThread();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
    //if done repeatedly amount value will show 1 sometime and 2 sometimes
}
