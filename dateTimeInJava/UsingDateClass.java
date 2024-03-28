/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateTimeInJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Binam Pokharel
 */
public class UsingDateClass {
   public static void main(String[] args) 
    { 
      System.currentTimeMillis();//useful method for debugging
    // Create a Date object representing the current date
    
        Date currentDate = new Date();

        // Convert the Date to a Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        // Add one day
        calendar.add(Calendar.DAY_OF_MONTH, 1);

        // Get the updated Date
        Date nextDay = calendar.getTime();
        
        boolean a = nextDay.after(currentDate); // Checking nextDay is after currentDate
        System.out.println("Next comes after Current day: "+a);
  
        boolean b = currentDate.before(nextDay); 
        System.out.println("Current day comes before next :  "+b);
        
        boolean checker = nextDay.before(currentDate); 
        System.out.println("next day comes before Current day  :  "+checker);
        
        boolean c = currentDate.before(currentDate); 
        System.out.println("Equal Days :  "+c);


        int compareDates = currentDate.compareTo(nextDay); // mydate - comparing Date
        int compareDatesPositive = nextDay.compareTo(currentDate);
        int compareDatesEqual = currentDate.compareTo(currentDate);
        
        
        System.out.println("Current Date: " + currentDate);
        System.out.println("Next Day: " + nextDay);
        System.out.println("Compare is : " + compareDates);
        System.out.println("compareDatesPositive is : " + compareDatesPositive);
        System.out.println("compareDatesEqual is : " + compareDatesEqual);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String currentDateAfterFormat = sdf.format(currentDate);
        System.out.println("print current formatted Date "+currentDateAfterFormat);
    } 
}
