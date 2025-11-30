/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24.pkgthis.keyword.pkg2;

class Person{
    void massage(){
        System.out.println("I am massage method");
    }
    
    void display(){
        //this.massage();
        massage();                                //method auto call hocce, this keyword no need.
        System.out.println("I am display method");
    }
}
public class ThisKeyword2 {

    public static void main(String[] args) {
       
        Person p1 = new Person();
        p1.display();
    }
    
}
