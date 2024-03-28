/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputOutputStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Binam Pokharel
 */

//# Wap in Java to use a buffer reader and find if the records are duplicates if the combination of Name and Passport Number is repeated. List the duplicate values if the record contains duplicate
//
//Store this text in a file called: rawFiles.txt(where each column represents: Name, Age, and Passport Number)
//
//Ram|2|A0121
//Shyam|5|1234
//Sita|25|5678
//Ram|2|A0121
//Shyam|5|5678
//Sita|24|5678

public class BufferReaderExampleToCheckDuplicatefromFile {
    
    private String combo;
    private int lineNumber;

    public BufferReaderExampleToCheckDuplicatefromFile(String combo, int lineNumber) {
        this.combo = combo;
        this.lineNumber = lineNumber;
    }
    

    public static void main(String[] args) throws FileNotFoundException {
        String filepath = "E:\\h2Db\\fileInputStreamExample\\bufferReaderExample\\records.txt";
        try {
            String line = "";
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            Set<String> uniqueCombinations = new HashSet<>();
            Set<String> dupColl = new HashSet<>();
//            Set<BufferReaderExampleToCheckDuplicatefromFile>dupColl = new HashSet<>();
            int i=0;
            while ((line = br.readLine()) != null) {
                i++;
                String[] values = line.split("|");
                String combination = values[0] + "|" + values[2];
                if (!uniqueCombinations.add(combination)) {
                    // If it's not unique, it's a duplicate
                    dupColl.add(combination);
//                    dupColl.add(new BufferReaderExampleToCheckDuplicatefromFile(combination, i));
                } else {
                    uniqueCombinations.add(combination);
                }
            }

            // Print the duplicate combinations
            if (!dupColl.isEmpty()) {
                System.out.println("Duplicate Combinations:");
                for (String combination : dupColl) {
//                for (BufferReaderExampleToCheckDuplicatefromFile combination : dupColl) {
//                    System.out.println(combination.combo +" in line number: "+combination.lineNumber);
                    System.out.println(combination);
                }
            } else {
                System.out.println("No duplicate combinations found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
