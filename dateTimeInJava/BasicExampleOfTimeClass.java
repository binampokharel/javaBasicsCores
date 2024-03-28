/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateTimeInJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Binam Pokharel
 */
public class BasicExampleOfTimeClass {
    public static void main(String[] args) {
    LocalDate myDate = LocalDate.now(); // Create a date object
    System.out.println("Display Current Date: "+myDate); // Display the current date
    
    LocalTime myTime = LocalTime.now();
    System.out.println("Display Current Time: "+myTime);
    
    LocalDateTime myDateTime = LocalDateTime.now();
    System.out.println("Display Current Date and Time: "+myDateTime);
    
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    String formattedDate = myDateTime.format(myFormatObj);
    String formattedDateWithSlash = myDateTime.format(myFormatObj2);
    System.out.println("After formatting: " + formattedDate);
    System.out.println("After formatting with slash: " + formattedDateWithSlash);
    
    
      // Create a LocalDate object representing the current date
        LocalDate currentDate = LocalDate.now();

        // Add one day
        LocalDate nextDay = currentDate.plusDays(1);

        System.out.println("Current Date: " + currentDate);
        System.out.println("Next Day: " + nextDay);
  }
  }
