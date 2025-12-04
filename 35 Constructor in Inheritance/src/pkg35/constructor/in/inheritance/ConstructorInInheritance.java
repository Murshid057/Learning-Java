/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg35.constructor.in.inheritance;

class Parents{
    Parents(){
        System.out.println("Hello");
    }
}
class Child extends Parents{
    Child(){
        System.out.println("Hellow 2");
    }
}
class Grandchild extends Child{
    Grandchild(){
        System.out.println("Hello 3");
    }
}
public class ConstructorInInheritance {

    public static void main(String[] args) {
        
        Grandchild s = new Grandchild();
    }
    
}
