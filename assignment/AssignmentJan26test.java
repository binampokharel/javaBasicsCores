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
public class AssignmentJan26test {
    public static void main(String[] args) {
        double incomeRateForLife = 0;
        StringBuilder sb = new StringBuilder(" No-Pain-No-Gain-");
       incomeRateForLife= MyStaticClass.myWord.startsWith("WORK") ? 
               MyStaticClass.income+5000
               :MyStaticClass.income+2000;
//        if(MyStaticClass.myWord.startsWith("WORK")){
//            incomeRateForLife+=MyStaticClass.income+5000;
//        }else{
//             incomeRateForLife+=MyStaticClass.income+2000;
//        }
        if(incomeRateForLife>10000){//15000.5>10000
            sb.append("\"YES\"-").append(MyStaticClass.myWord);//No-Pain-No-Gain-"YES"-WORK-LIFE-BALANCE
            String myword = sb.toString();
            System.out.println("myWord "+myword);
        }else{//5123.25>10000
            sb.append("\"No\"-").append(MyStaticClass.myWord);//No-Pain-No-Gain-"No"-WORK-LIFE-BALANCE
        }
        
        String initialWord = sb.toString();
                System.out.println("Initial Word: "+ initialWord); //No-Pain-No-Gain-"YES"-WORK-LIFE-BALANCE"
                String changedWord ="";
          if(incomeRateForLife>10000){
             changedWord = initialWord.replaceAll("No|Pain|Gain", "YES");
             //YES-YES-YES-YES-"YES"-WORK-LIFE-BALANCE
          }else{
               changedWord =initialWord;
               //No-Pain-No-Gain-"No"-WORK-LIFE-BALANCE
          }    
        System.out.println("Change word: "+ changedWord.replace("-", "/"));
                     //YES/YES/YES/YES/"YES"/WORK/LIFE/BALANCE
                     //No/Pain/No/Gain/"No"/WORK/LIFE/BALANCE

        System.out.println("The Initial Income was= "+MyStaticClass.income);
        System.out.println("The Changed Income is= "+incomeRateForLife);
        
        String thevalueForTernary= incomeRateForLife>10000 ? "YES" : "No";
        System.out.println("thevalueForTernary "+thevalueForTernary);
    }
    
}
