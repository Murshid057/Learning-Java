/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg28.dynamic.method.dispatch;

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

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        
        Person p = new Person();
        p.display();
        
        //Person p = new Teacher();
        p = new Teacher();                 //Dynamic Method Dispatch;
        p.name = "Mizanur Rahman";
        p.age = 27;
        p.display();
    }
    
}
