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
public class BooleanExample {

    public static void main(String[] args) {
        System.out.print("Are you above 18?- ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean bn = s.equalsIgnoreCase("Yes")? true: false;
        if (bn == true) {
            System.out.println("You are over 18");
        } else if (bn == false) {
            System.out.println("You are under 18");
        }
        sc.close();
    }
}
