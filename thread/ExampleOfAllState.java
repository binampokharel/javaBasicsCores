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
public class ExampleOfAllState {

    public static void main(String[] args) throws InterruptedException {
        // New State
        Thread newThread = new Thread(new ThreadMainExample(), "NewThread");
        System.out.println(newThread.getName() + " is in " + newThread.getState() + " state.");

        // Runnable State
        newThread.start();
        Thread.sleep(100); // To ensure the newThread starts and goes to Runnable state
        System.out.println(newThread.getName() + " is in " + newThread.getState() + " state.");

        // Blocked State
        Thread blockedThread = new Thread(new ThreadMainExample(), "BlockedThread");
        blockedThread.start();
        Thread.sleep(100); // To ensure the blockedThread starts and goes to Runnable state
        synchronized (blockedThread) {
            blockedThread.wait(); // This will make the blockedThread go into a blocked state
        }
        System.out.println(blockedThread.getName() + " is in " + blockedThread.getState() + " state.");

        // Waiting State
        Thread waitingThread = new Thread(new ThreadMainExample(), "WaitingThread");
        waitingThread.start();
        Thread.sleep(100); // To ensure the waitingThread starts and goes to Runnable state
        synchronized (waitingThread) {
            waitingThread.wait(); // This will make the waitingThread go into a waiting state
        }
        System.out.println(waitingThread.getName() + " is in " + waitingThread.getState() + " state.");

        // Timed Waiting State
        Thread timedWaitingThread = new Thread(new ThreadMainExample(), "TimedWaitingThread");
        timedWaitingThread.start();
        Thread.sleep(100); // To ensure the timedWaitingThread starts and goes to Runnable state
        synchronized (timedWaitingThread) {
            timedWaitingThread.wait(200); // This will make the timedWaitingThread go into a timed waiting state
        }
        System.out.println(timedWaitingThread.getName() + " is in " + timedWaitingThread.getState() + " state.");

        // Terminated State
        Thread terminatedThread = new Thread(new ThreadMainExample(), "TerminatedThread");
        terminatedThread.start();
        Thread.sleep(500); // To ensure the terminatedThread finishes its task
        System.out.println(terminatedThread.getName() + " is in " + terminatedThread.getState() + " state.");
    }
}
