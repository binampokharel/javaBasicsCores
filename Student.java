
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
public class Student {
  public static int initial = 2;
  public int normal = 2;
  
 public Student(){
     initial =initial+1;//3+1
     normal = normal+1;
 }
 public void checkMethod(){
     double normal =2;
     
 }
 
 public static String returnMyMethod(){
     Date d = new Date();
     
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     sdf.format(d);
     String dates=sdf.format(d);
     System.out.println("sdf"+dates);
     return dates;
 }

  
  
}
