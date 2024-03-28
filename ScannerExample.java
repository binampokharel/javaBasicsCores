
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Binam Pokharel
 */
public class ScannerExample {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter text");
        String a = s.nextLine();
        System.out.println("Text " + a);
        
        System.out.println("Enter Number");
        int b = s.nextInt();
        System.out.println("Number " + b);
        s.nextLine();
        
        System.out.println("Enter text again");
        String c = s.nextLine();
        System.out.println("Text " + c);
    }

}
