/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg27.runtime.polymorphism;

class Person{
    String name;
    int age;
    
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
class Teacher extends Person{
    String qualification;
    
    @Override
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(qualification);
    }
}
public class RuntimePolymorphism {

    public static void main(String[] args) {
        
        Person p = new Person();
        p.age = 20;
        p.name ="Murshid Mahmud";
        p.display();
        
        Teacher t = new Teacher();
        p.age = 30;
        p.name = "Mizanur Rahman";
        t.display();
    }
    
}
