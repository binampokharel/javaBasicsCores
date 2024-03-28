/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsAndSwitch;

/**
 *
 * @author Binam Pokharel
 */
public class SwitchExample {

    public static void main(String[] args) {
		int num=500;
                
		switch(num){
		case 5 :
                    System.out.println("It is 5");
                    break;
		case 10 : 
                    System.out.println("It is 10");
                    break;
		case 15 :
                    System.out.println("It is 15");
                    break;
		case 20 :
                    System.out.println("It is 20");
                    break;
		default:
                    System.out.println("Not present");
			
		}

       String desiredDayToVisitOffice = "monday";
       String returningValueFromSwitch = StaticClassForDaysSwitch.returnWorkingHourForEmployee(desiredDayToVisitOffice);
        System.out.println("User Input Day: "+desiredDayToVisitOffice +" Output for Employee: "+returningValueFromSwitch);
        
    }

}
