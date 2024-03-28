/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentVerify;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Binam Pokharel
 */
public class SajjuAssignment {
    public static void main(String[] args) {
           try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\duplicateTextFile\\records.txt"));

            String line;
            Set<String> uniqueRecords = new HashSet<>();
            Set<String> duplicateRecords = new HashSet<>();

            while ((line = reader.readLine()) != null) {
                String[] columns = line.split("\\|");
                String name = columns[0].trim();
                String age = columns[1].trim();
                String passportNumber = columns[2].trim();

                String record = name + "|" + age + "|" + passportNumber;

                if (!uniqueRecords.add(record)) {
                    // Duplicate record found
                    duplicateRecords.add(record);
                }
            }

            // Display duplicate records
            if (!duplicateRecords.isEmpty()) {
                System.out.println("Duplicate Records:");
                duplicateRecords.forEach(System.out::println);
            } else {
                System.out.println("No Duplicate Records Found.");
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
