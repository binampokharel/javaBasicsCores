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
public class School {
    private int schoolId;
    private String schoolName;
    private String schoolAddress;

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public School(int schoolId, String schoolName, String schoolAddress) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
    }
    
    public School() {
    }
    
}
