/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Binam Pokharel
 */

//WAP in Java to use the if-else if-else. The following tasks need to be performed;
//1. Declare a static variable called numbIncrementer = 2 and keep it in a different class
//2. Add 10 to the existing numbIncrementer variable and assign the final value in the variable called num.
//3. Use a ternary operator to check if the number that was called from the static variable is greater than 10 or not. if it is true, the String variable named correct should be Yes, else it should be No.
//3. Check if the string variable contains yes or no (can be of uppercase/lowercase/mix case).
//
//4. If the String variable contains yes
//  -- check if num is greater than 5(true)
//	if num is greater than 5
//		-num should add 5 to its initial value
//			-check if num is now greater than 20 if yes 
//		   		--5 should be added to the num variable 
//			- if the above part is incorrect, check if num is greater than 5 if yes
// 		   		--num should now decrease 5 from its previous value
//			- if none of the conditions is true, assign value 20 to the num variable
//
// -- check if num is greater than 5(true) -- if this part is false
//    num should be twice the existing number
//
//5. Finally use the statement should display;
//Number is 12
public class AssignmentFeb1 {
    public static void main(String[] args) {
        int num = MyStaticClass.numbIncrementer +10;
        String correct = num>10?"Yes":"No";
        int lengthOfCorrect = 0;
        if(correct.equalsIgnoreCase("YES")){
            if(num>5){
                num+=5;
                if(num>20){
                    num+=5;
                }else if(num>5){
                     num-=5;
                }
                else{
                    num = 20;
                }
            }else{
                num=num*2;
            }
        }
        System.out.println("Number is "+num);
    }
}
