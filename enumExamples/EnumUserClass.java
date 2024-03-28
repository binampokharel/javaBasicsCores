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
public class EnumUserClass {
    public static void main(String[] args) {
        String friday = EnumDefault.FRIDAY.getDescription();
        String fridayDesc = EnumDefault.FRIDAY.getShortName();
//        
        System.out.println("FRIDAY "+friday);
        System.out.println("FRIDAY Desc "+fridayDesc);


//        System.out.println("STATUS "+SimpleEnumExample.ACTIVE);
//        System.out.println("STATUS "+SimpleEnumExample.AWAY);
//        String offline = SimpleEnumExample.AWAY.toString();
//        
//        System.out.println("offline "+offline);

    }
    
}
