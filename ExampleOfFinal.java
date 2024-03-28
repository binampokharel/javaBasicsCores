
import com.sun.xml.internal.ws.util.StringUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Binam Pokharel
 */
public class ExampleOfFinal  {
    public static void main(String[] args) {
        Main m = new Main();
//        int returnNumber = m.returnNumber;System.out.println("return" +returnNumber);
        if(false){
            System.out.println("ayushna");
        }
        System.out.println("Hello");
        
        String a = "BINAM";
        String b = "bINAM";
        String c = "binam";
        
        System.out.println("a "+StringUtils.capitalize(a) +" b: "+StringUtils.capitalize(b) +" c: "+StringUtils.capitalize(c));
    }
}
