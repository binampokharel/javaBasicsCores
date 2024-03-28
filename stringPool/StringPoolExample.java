/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringPool;

/**
 *
 * @author Binam Pokharel
 */
public class StringPoolExample {
    public static void main(String[] args)   
{  
long startTime = System.currentTimeMillis();
String s1 = "Java";  
String s2 = "Java";  
String s3 = new String("Java");  
String s6 = new String("Java");  
String s4 = new String("Java").intern();  
String s5 = new String("Java").intern();  
System.out.println((s1 == s2)+", String are equal."); // true  
System.out.println((s1 == s3)+", String are not equal."); // false  
System.out.println((s1 == s4)+", String are equal."); // true  
System.out.println((s3 == s4)+", String are not equal."); // true  
System.out.println((s3.equals(s4))+", String are equal."); // true  
System.out.println((s3.equals(s1))+", String are equal equal."); // true  
System.out.println((s4.equals(s5))+", String are equal equal."); // true  
System.out.println((s4 == s5)+", String are equal."); // true  

StringBuffer sb = new StringBuffer("Java");
sb.equals(s1);
System.out.println(sb.toString().equals(s3)+", String are e."); // true  
System.out.println(sb.toString()== s1+", String are what"); // true  

long endTime = System.currentTimeMillis();
long totalTime = endTime - startTime;
    System.out.println("The start time was "+startTime);
    System.out.println("The end time was "+endTime);
    System.out.println("The execn time was "+totalTime);
}  
}
