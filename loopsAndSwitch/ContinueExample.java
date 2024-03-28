/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsAndSwitch;

/**
 *
 * @author Binam Pokharel
 */
public class ContinueExample {
    public static void main(String args[])
	{
		for (int i = 0; i < 10; i++) {
			// If the number is even
			// skip and continue
			if (i % 2 == 0)
				continue;
			// If number is odd, print it
			System.out.print(i + " ");
		}
	}
}
