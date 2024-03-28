/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Binam Pokharel
 */
public class ParameterisedConstructor {

    int id;
    String name;

    // Paramterized Constructor
    public ParameterisedConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Id: " + id + " name: " + name);
    }

    @Override
    public String toString() {
        return "ParameterisedConstructor{" + "id=" + id + ", name=" + name + '}';
    }
    
    public static void main(String[] args) {
        ParameterisedConstructor pc = new ParameterisedConstructor(1, "Philip");
        ParameterisedConstructor pc1 = new ParameterisedConstructor(2, "Aron");
        ParameterisedConstructor pc2 = new ParameterisedConstructor(3, "Kriti");
        ParameterisedConstructor pc3 = new ParameterisedConstructor(4, "Sajju");
        ParameterisedConstructor pc4 = new ParameterisedConstructor(5, "Samira");
        ParameterisedConstructor pc5 = new ParameterisedConstructor(1, "Philip");
        
        pc.display();
        pc1.display();
        pc2.display();
        pc3.display();
        pc4.display();
        pc5.display();
        
        System.out.println("PC "+pc);
        System.out.println("PC "+pc1);
        System.out.println("PC "+pc2);
        System.out.println("PC "+pc3);
        System.out.println("PC "+pc4);
        System.out.println("PC "+pc5);
    }
}
