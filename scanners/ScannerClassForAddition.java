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
public class ScannerClassForAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Input Second Number: ");
        int num2 = sc.nextInt();

        int result = num1 + num2;

        System.out.println("result after adding " + num1 + " And " + num2 + " is " + result);
    }

}
