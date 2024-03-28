/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputOutputStream;

import java.io.File;

/**
 *
 * @author Binam Pokharel
 */
public class CreatingDirectories {
     public static void main(String args[]) {
      String dirname = "E:\\h2Db\\fileInputStreamExample\\javaClassSecond";
      File d = new File(dirname);
      
      // Create directory now.
      d.mkdir();
   }
}
