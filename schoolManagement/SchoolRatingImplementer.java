/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolManagement;

import java.util.List;

/**
 *
 * @author Binam Pokharel
 */
public class SchoolRatingImplementer extends SchoolRating {

    @Override
    public String returnSchoolRatingByPerformance(int studentPassNumber, String school) {
        String rating = "";
        if (studentPassNumber > 50 && studentPassNumber < 100) {
            rating = "Good";
        } else if (studentPassNumber > 100 || studentPassNumber == 100) {
            rating = "Top performer";
        } else {
            rating = "Poor ";
        }
        return school + " Has " + rating + "Rating";
    }

}
