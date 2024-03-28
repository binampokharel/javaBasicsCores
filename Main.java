
import com.sun.xml.internal.ws.util.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Binam Pokharel
 */
public final class Main {
    
     static int a;
     static final Integer nonPrimitive=25;
     public int returnNumber =20;

    
     public static void main(String[] args) {
//     String a = "binam";
//     String b = "binam";
//     String c = new String("binam").intern();
//     String d = new String("binam");
//     
//     
//     
//         System.out.println((a == b)+", String are equal."); // true  
//         System.out.println((a == c)+", String are not equal."); // true  
//         System.out.println((a.equals(c))+", String are equal."); // true  
//         System.out.println((c==d)+", String are not equal."); // true  
//         System.out.println((b==c)+", String are  equal."); // true  
//         

//         Student s1 = new Student();
//         System.out.println("first time"+s1.normal);
//         System.out.println("first time initial"+Student.initial);
//         
//         Student s2 = new Student();
//         System.out.println("Second time"+s2.normal);
//         System.out.println("second time initial"+Student.initial);
//         
//          Student s3 = new Student();
//         System.out.println("Third time"+s3.normal);
//         System.out.println("Third time initial"+Student.initial);



//         

//
//         Student s2 = new Student();
//         System.out.println("Second time"+s2.normal);
//         
//         Student s3 = new Student();
//         System.out.println("Third time"+s3.normal);
//         
//         int valueofNormal = new Student().normal;
//         System.out.println("valueofNormal "+valueofNormal);
//         System.gc();

         System.out.println(" non "+nonPrimitive.intValue());
         System.out.println(" primitive "+Student.returnMyMethod());
         
         String a = "binam";
         String b =StringUtils.capitalize(a);
         System.out.println("A is "+b);
}
     
}
