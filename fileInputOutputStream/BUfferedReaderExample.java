/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputOutputStream;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Binam Pokharel
 */
public class BUfferedReaderExample {
     public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("E:\\h2Db\\fileInputStreamExample\\bufferReaderExample\\hello.txt");    
          BufferedReader br=new BufferedReader(fr);    
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
}
