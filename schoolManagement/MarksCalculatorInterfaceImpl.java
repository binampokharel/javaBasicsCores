/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolManagement;

/**
 *
 * @author Binam Pokharel
 */
public class MarksCalculatorInterfaceImpl implements MarksCalculatorInterface {

    @Override
    public String printResultMessage(boolean result) {
        String resultDate = HelperUtil.currentDate();
        String resultMsg = "";
        if(result){
            resultMsg =  "Congratulations you are pass!! for the result on "+resultDate;
        }else{
             resultMsg =  "Oops!!! you are fail for the result on "+resultDate;
        }
        return resultMsg;
    }

    @Override
    public double finalMarks(double marks1,double marks2,double marks3,double marks4) {
       double totalMarks = marks1+marks2+marks3+marks4;
       return totalMarks;
    }

    @Override
    public double calculatePercentage(double obtainedMarks,double total) {
        double percentage = obtainedMarks/total * 100;
        return percentage;
    }
    
}
