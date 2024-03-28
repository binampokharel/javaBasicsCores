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
public class Shelf {
    Product product;
    static void addProduct(Product product,String reviews){
         product.seeReviews(reviews);
    }
     void customizeShelf(Product product,String sample){
      product.getSample(sample);
    }

  public static void main(String[] args) {
        // Example usage
        Shelf shelf = new Shelf();
        shelf.addProduct(new DVD()," DVD reviews"); 
        shelf.customizeShelf(new DVD()," DVD Sample "); 
        System.out.println("");
        shelf.addProduct(new Book()," book reviews"); 
        shelf.customizeShelf(new Book()," book Sample "); 
        
    
  }
}
