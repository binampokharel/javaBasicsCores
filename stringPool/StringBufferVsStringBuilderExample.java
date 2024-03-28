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
public class StringBufferVsStringBuilderExample {
    public static void main(String[] args) {
        // Using StringBuffer (thread-safe)
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello, ");
        stringBuffer.append("World!");
        
        // Creating a separate thread to simulate concurrency
        Thread thread = new Thread(() -> {
            stringBuffer.append(" This is a thread-safe operation.");
        });
        
        // Starting the thread
        thread.start();
        
        try {
            // Waiting for the thread to complete
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Printing the final result
        System.out.println("StringBuffer Result: " + stringBuffer.toString());

        // Using StringBuilder (not thread-safe)
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, ");
        stringBuilder.append("World!");
        
        // Creating another thread to simulate concurrency
        Thread anotherThread = new Thread(() -> {
            stringBuilder.append(" This is a faster operation.");
        });
        
        // Starting the second thread
        anotherThread.start();
        
        try {
            // Waiting for the second thread to complete
            anotherThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Printing the final result
        System.out.println("StringBuilder Result: " + stringBuilder.toString());
    }
}
