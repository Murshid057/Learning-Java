/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19.method.overridden;

class Person{
    String name;
    int age;
    
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: " +age);
    }
}

class Teacher extends Person{
    String information;
    
    @Override
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("Infor: "+information);
        System.out.println("\n");
    }
}
public class MethodOverridden {

    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.name = "Mizanur Rahman";
        t1.age = 25;
        t1.information = "Bsc in CSE";
        t1.display();
        
        Person p1 = new Person();
        p1.name = "Teacher";
        p1.age = 25;
        p1.display();
    }
    
}
