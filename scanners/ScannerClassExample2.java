/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanners;

import java.util.Scanner;

/**
 *
 * @author Binam Pokharel
 */
public class ScannerClassExample2 {

    public static void main(String args[]) {
        String str = "Hello/This is JavaTpoint/My name is Abhishek.";
        //Create scanner with the specified String Object  
        Scanner scanner = new Scanner(str);

        System.out.println("Boolean Result: " + scanner.hasNextBoolean());
        //Change the delimiter of this scanner  
        scanner.useDelimiter("/");

       //Printing the tokenized Strings  
        System.out.println("---Tokenizes String---");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.next());
        }
        //Display the new delimiter  
        System.out.println("Delimiter used: " + scanner.delimiter());
        scanner.close();
    }
}
