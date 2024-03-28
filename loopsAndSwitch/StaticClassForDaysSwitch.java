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
public class StaticClassForDaysSwitch {

    public static final String returnWorkingHourForEmployee(String day) {
        String desiredValue = "";
        switch (day.toLowerCase()) {
            case "monday":
                desiredValue = "Office Hour for Monday is 10-5";
                break;
            case "tuesday":
                desiredValue = "Office Hour for Tuesday is 10-5";
                break;
            case "wednesday":
                desiredValue = "Office Hour for Wednesday is 10-2";
                break;
            case "thursday":
                desiredValue = "Office Hour for Thursday is 1-10";
                break;
            case "friday":
                desiredValue = "Office Hour for Friday is 10-3";
                break;
            default:
                desiredValue = "It's Holiday and no working hour";
        }
        return desiredValue;
    }

}
