/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputOutputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Binam Pokharel
 */
public class ReadingDataFromConsoleBufferedReader {

    public static void main(String[] args) {
        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            System.out.println("Enter your name");
            String name = br.readLine();
            System.out.println("Welcome " + name);
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}
