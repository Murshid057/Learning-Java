/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg32.pkginterface;

interface Animal{
    void eat();
}
class Cat implements Animal{
    @Override
    public void eat(){
        System.out.println("Meo Meo");
    }
}
class Dog implements Animal{
    @Override
    public void eat(){
        System.out.println("Push push");
    }
}
public class Interface {

    public static void main(String[] args) {
        
        Cat c = new Cat();
        c.eat();
        
        Dog d = new Dog();
        d.eat();
    }
    
}
