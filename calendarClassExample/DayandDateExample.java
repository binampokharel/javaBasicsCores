/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarClassExample;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Binam Pokharel
 */
public class DayandDateExample {
     public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();

        // Get the day of the week as an enum (DayOfWeek)
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        

        // Get the day as a String
        String dayAsString = dayOfWeek.toString();

        // Print the result
        System.out.println("Today is: " + dayAsString);
        
        // If you want to get the day as a numeric value (1 for Monday, 2 for Tuesday, etc.)
        int dayValue = dayOfWeek.getValue();
        System.out.println("Today's numeric value is: " + dayValue);

        // If you want to format the date in a specific way, you can use DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted date: " + formattedDate);
    }
}
