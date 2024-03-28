/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Binam Pokharel
 */
public class FileInputOutputStreamUsingFileClass {

    public static void main(String[] args) throws IOException {
        String filePath = "E:\\h2Db\\fileInputStreamExample\\fileStreamUsingFileClass\\readingFile.txt";

        File file = new File(filePath);
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(file);

            outputStream = new FileOutputStream("E:\\h2Db\\fileInputStreamExample\\fileStreamUsingFileClass\\output.txt");

            // Read data from the file and write it to another file
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);

                // Write the read data to another file
                outputStream.write(data);
            }

            // Close the InputStream and OutputStream when done
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
