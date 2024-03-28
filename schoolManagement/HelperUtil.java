/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolManagement;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Binam Pokharel
 */
public class HelperUtil {

    public static final String currentDate() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String currDate = sdf.format(d);
        return currDate;
    }

    public static final String returnSchoolName(int id) {
        String schoolName = "";
        switch (id) {
            case 1:
                schoolName = "Sagarmatha";
                break;

            case 2:
                schoolName = "St. Xaviers";
                break;

            case 4:
                schoolName = "Top Kindergarten School";
                break;

            default:
                schoolName = "Government School";
                break;
        }
        return schoolName;
    }

    public static final String returnSchoolName(String shortCode) {
        String schoolName = "";
        switch (shortCode.toUpperCase()) {
            case "SA":
                schoolName = "Sagarmatha";
                break;

            case "ST":
                schoolName = "St. Xaviers";
                break;

            case "K":
                schoolName = "Top Kindergarten School";
                break;

            default:
                schoolName = "Government School";
                break;
        }
        return schoolName;
    }
}
