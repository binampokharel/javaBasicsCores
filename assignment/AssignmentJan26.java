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

//#WAP in Java to check if the number is even or odd. Use a boolean returning static method to return true(even) and false(odd)
//[keep this static method in a different class and use the main method in a different class]. Based on the result provide the print statement as;
// if we have, int num =3;// this should print output as 3 is odd number
//	     int num =2; //this should print output as 2 is an even number	
//[Note: We are not asking the input from the user, we will just keep the value hard-coded for now]
//
//
//#WAP in java to perform the following task; [Note: We are not asking the input from the user, we will just keep the value hard-coded for now]
//
// 1. Create a static method where you will have two variables,myWord = "WORK-LIFE-BALANCE" and income =123.25 (it can be any number and should be able to hold decimal values as well)
// 2. Check if myWord starts with "WORK" then add 5000 to the existing income, if not add 2000
// 3. Create a new string variable and assign the value "No-Pain-No-Gain"
// 4. Check if incomeRateForLife>10000 then the word should print as
//  Initial Word: No-Pain-No-Gain-"YES"-WORK-LIFE-BALANCE
//  Changed Word: Yes/Yes/Yes/Yes/"YES"/WORK/LIFE/BALANCE [replace - with /]
// 5. if the condition is false, the word should be printed as 
//   Initial Word: No-Pain-No-Gain-"NO"-WORK-LIFE-BALANCE
//   Changed Word: No/Pain/No/Gain/"NO"/WORK/LIFE/BALANCE  [replace - with /]
// 6. The initial income was = 123.25(income from static class)
// 7. The changed income is =  5123.25(incomeRateForLife)
//
//In summary: if I provide  income = 10000.5 in my static class, the following should be displayed in the print statement
//Initial Word:  No-Pain-No-Gain-"YES"-WORK-LIFE-BALANCE
//Change word:  YES/YES/YES/YES/"YES"/WORK/LIFE/BALANCE
//The Initial Income was= 10000.5
//The Changed Income is= 15000.5
//
//if I provide income =123.25 in my static class, the following should be displayed in the print statement
//
//Initial Word:  No-Pain-No-Gain-"No"-WORK-LIFE-BALANCE
//Change word:  No/Pain/No/Gain/"No"/WORK/LIFE/BALANCE
//The Initial Income was= 123.25
//The Changed Income is= 5123.25

public class AssignmentJan26 {
    public static void main(String[] args) {
        double incomeRateForLife = 0;
        if(MyStaticClass.myWord.startsWith("LIFE")){
            incomeRateForLife+=MyStaticClass.income+5000 ;
        }else{
            incomeRateForLife+=MyStaticClass.income +2000;
        }
        StringBuffer sb = new StringBuffer("No-Pain-No-Gain");
        if(incomeRateForLife>10000){
            sb.append("-").append("\"YES\"-").append(MyStaticClass.myWord);
        }else{
            sb.append("-").append("\"NO\"-").append(MyStaticClass.myWord);
        }
        String finalWord = sb.toString();
        System.out.println("Initial Word: "+finalWord);
        System.out.println("IncomeRate is: "+incomeRateForLife);
         if(incomeRateForLife>10000){
             //the regular expression "No|Pain|Gain" uses the | (pipe) symbol 
             //as a logical OR, allowing you to match any of the specified words. 
             finalWord = finalWord.replaceAll("No|Pain|Gain", "Yes");
         }
           String replacedHyphen = finalWord.replace("-", "/");

        System.out.println("Changed Word is: "+replacedHyphen);
    }
    
}
