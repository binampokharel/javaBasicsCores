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
public class ScannerClassExample {
    public static void main(String[] args) {
        
        Scanner scanForText = new Scanner(System.in);
        
        Scanner scanForNumber = new Scanner(System.in);
        
        System.out.println("Enter name of Student : ");
        String name = scanForText.nextLine();
        
        System.out.println("Enter age of Student : ");
        int age = scanForNumber.nextInt();
        
        System.out.println("Enter address of Student : ");
        String address = scanForText.nextLine();
        
        System.out.println("Enter phone of Student : ");
        String phone = scanForText.nextLine();
        
        System.out.println("Enter marks of Student : ");
         int marks = scanForNumber.nextInt();
        
        System.out.println("Student Name: "+name + " ,Age: "+age+ " ,Address: "+address+ " ,Phone: "+phone + " ,Marks: "+marks);
    }
}
