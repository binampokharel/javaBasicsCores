/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalsAndHashMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Binam Pokharel
 */
public class SimpleToHashCodeCheck {

    private String place;
    private String jobtype;

    public SimpleToHashCodeCheck(String place, String jobtype) {
        this.place = place;
        this.jobtype = jobtype;
    }

    @Override
    public int hashCode() {
       return Objects.hash(place,jobtype);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SimpleToHashCodeCheck other = (SimpleToHashCodeCheck) obj;
        return true;
    }
    
    

    public static void main(String[] args) {
        Map<SimpleToHashCodeCheck, String> leaders = new HashMap<>();
        leaders.put(new SimpleToHashCodeCheck("New York", "development"), "Anne");
        leaders.put(new SimpleToHashCodeCheck("Boston", "development"), "Brian");
        leaders.put(new SimpleToHashCodeCheck("Boston", "marketing"), "Charlie");

        SimpleToHashCodeCheck myTeam = new SimpleToHashCodeCheck("New York", "development");
        String myTeamLeader = leaders.get(myTeam);
        //We would expect myTeamLeader to return “Anne,” but with the current code, it doesn’t.

        //If we want to use instances of the Team class as HashMap keys,
        //we have to override the hashCode() method so that it adheres to the contract; equal objects return the same hashCode.
        System.out.println("myTeamLeader: "+myTeamLeader);
    }

}
