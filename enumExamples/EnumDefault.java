/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumExamples;

/**
 *
 * @author Binam Pokharel
 */

public enum EnumDefault {
    
    SUNDAY("SUN","Library is closed"),
    MONDAY("MON","Library is opened"),
    TUESDAY("TUE","Library is opened"),
    WEDNESDAY("WED","Library is closed"),
    THURSDAY("THU","Library is opened"),
    FRIDAY("FRI","Library is opened"),
    SATURDAY("SAT","Library is closed");
    
    private final String description;
    private final String shortName;

    public String getDescription() {
        return description;
    }
    
    public String getShortName(){
        return shortName;
    }
    
    private EnumDefault(String shortName,String description) {
        this.description = description;
        this.shortName = shortName;
    }
    
}
