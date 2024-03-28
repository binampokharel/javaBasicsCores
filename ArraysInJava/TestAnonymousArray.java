/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysInJava;

/**
 *
 * @author Binam Pokharel
 */
class TestAnonymousArray{
//creating a method which receives an array as a parameter
static void printArray(int arr[]){

System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);
}

public static void main(String args[]){
printArray(new int[]{10,22,44,66});//passing anonymous array to method
}

}
