/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringPool;

/**
 *
 * @author Binam Pokharel
 */
public class StringBuilderNotThreadSafeExample {
    public static void main(String[] args) {
        StringBuilder sharedBuilder = new StringBuilder();

        // Thread 1 appends "Hello, " to the sharedBuilder
        Thread thread1 = new Thread(() -> {
            sharedBuilder.append("Hello, ");
        });

        // Thread 2 appends "World!" to the sharedBuilder
        Thread thread2 = new Thread(() -> {
            sharedBuilder.append("World!");
        });

        // Start both threads concurrently
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to complete
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final result, which may be unpredictable due to lack of synchronization
        System.out.println("Result: " + sharedBuilder.toString());
    }
}
