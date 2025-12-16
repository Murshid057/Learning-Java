/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg39.anonymous.classs;

class Person{
    
    void display(){
        System.out.println("Hello person");
    }
}
public class AnonymousClasss {

    public static void main(String[] args) {
        
        Person p = new Person(){
                                              //Anonymous class
            @Override
            void display(){
                System.out.println("Hellow Anonymous");
            }
        };
        p.display();
    }
    
}
