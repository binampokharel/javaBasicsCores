/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateTimeInJava;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Binam Pokharel
 */
public class UsingTimeClassForDifference {
     public static void main(String[] args) {
        LocalDate d5 = LocalDate.of(2024, 1, 29);
        LocalDate d2 = LocalDate.now();

        long dateDiff = ChronoUnit.DAYS.between(d5, d2);
        System.out.println("date diff: " + dateDiff);
    }
    
}
