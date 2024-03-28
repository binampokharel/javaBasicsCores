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
public class PerformanceEvalulatorMain {

    public static void main(String[] args) {
        Student sagarmathaStudent = new Student(1, "Ram", "A1", 200, true, "Kathmandu", "A", 1, HelperUtil.returnSchoolName(1), "Nepal");
        Student xavierStudent = new Student(1, "Alex", "B1", 250, true, "Dallas", "B", 1, HelperUtil.returnSchoolName(2), "US");
        Student governmentStudent = new Student(1, "George", "G1", 250, false, "ChinaTown", "A+", 1, HelperUtil.returnSchoolName(2), "China");
        
        Student defaultStudent = new Student();
        defaultStudent.setId(2);
        defaultStudent.setName("Eliza");
        defaultStudent.setGrade("C");
        defaultStudent.setResult(true);
        defaultStudent.setMarks(320);
        defaultStudent.setRoll("c-1");
        defaultStudent.setSchoolName("Kindergarten");
        defaultStudent.setSchoolAddress("Texas");
        defaultStudent.setSchoolId(4);

        MarksCalculatorInterfaceImpl mr = new MarksCalculatorInterfaceImpl();
        String resultOfStudentFromSagarmatha = sagarmathaStudent.getName() + " " + mr.printResultMessage(sagarmathaStudent.isResult());
        String resultOfStudentFromXavier = xavierStudent.getName() + " " + mr.printResultMessage(xavierStudent.isResult());
        String resultOfStudentFromGov = governmentStudent.getName() + " " + mr.printResultMessage(governmentStudent.isResult());
        String resultOfDefaultStudent = defaultStudent.getName()+ " " + mr.printResultMessage(defaultStudent.isResult());

        System.out.println(resultOfStudentFromSagarmatha);
        System.out.println(resultOfStudentFromXavier);
        System.out.println(resultOfStudentFromGov);
        System.out.println(resultOfDefaultStudent);

        System.out.println("........................................................");

        System.out.println("School Rating Global by Date :" + HelperUtil.currentDate());

        System.out.println("........................................................");

        SchoolRatingImplementer sr = new SchoolRatingImplementer();
        String sagarmathaRating = sr.returnSchoolRatingByPerformance(200, HelperUtil.returnSchoolName("SA"));
        String xavierRating = sr.returnSchoolRatingByPerformance(400, HelperUtil.returnSchoolName("ST"));
        String govtRating = sr.returnSchoolRatingByPerformance(10, HelperUtil.returnSchoolName("GT"));
        String defRating = sr.returnSchoolRatingByPerformance(55, HelperUtil.returnSchoolName("K"));

        System.out.println(sagarmathaRating);
        System.out.println(xavierRating);
        System.out.println(govtRating);
        System.out.println(defRating);

    }

}
