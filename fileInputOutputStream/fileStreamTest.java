/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Binam Pokharel
 */
public class fileStreamTest {

    public static void main(String[] args) {
        String filepath = "E:\\h2Db\\fileInputStreamExample\\test.txt";

        try {
            // Writing bytes to the file
            byte[] bytesToWrite = "Hello Java Class On Feb 29".getBytes();
            OutputStream os = new FileOutputStream(filepath);
            os.write(bytesToWrite);
            os.close();

            // Reading bytes from the file
            InputStream is = new FileInputStream(filepath);
            int bytesRead;
            while ((bytesRead = is.read()) != -1) {
                System.out.print((char) bytesRead);
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
