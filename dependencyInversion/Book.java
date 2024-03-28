/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencyInversion;

/**
 *
 * @author Binam Pokharel
 */
public class Book implements Product {

    @Override
    public void seeReviews(String data) {
        System.out.println("FROM Book Reviews"+data);
    }

    @Override
    public void getSample(String sample) {
        System.out.println("FROM Book sample "+sample);
    }

}
