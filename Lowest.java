
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Binam Pokharel
 */
public class Lowest {

    public static void main(String[] args) {
        // Sample list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        // Initialize minNumber with the maximum integer value
        int minNumber = Integer.MAX_VALUE;

        // Iterate through the list to find the minimum number
        for (int number : numbers) {
            System.out.println("na" + number);
            System.out.println("minNumbera" + minNumber);
            if (number < minNumber) {
                System.out.println("nb" + number);

                minNumber = number;
                System.out.println("minb" + number);

            }
        }

        // Print the result
        System.out.println("Minimum number: " + minNumber);
    }
}
