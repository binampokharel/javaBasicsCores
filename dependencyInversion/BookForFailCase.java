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
public class BookForFailCase {

    static void addBook(Book book) {
        book.seeReviews("book reviews");
    }
    static void customizeShelf(Book book) {
        book.getSample("book sample");
    }

    static void addDVD(DVD dvd) {
        dvd.seeReviews(" DVD reviews ");
    }
     static void customizeShelf(DVD dvd) {
        dvd.getSample("DVD sample");
    }

    public static void main(String[] args) {
        BookForFailCase bf = new BookForFailCase();
        bf.addBook(new Book());
        bf.addDVD(new DVD());
        System.out.println("");
        bf.customizeShelf(new Book());
        bf.customizeShelf(new DVD());
    }
}
