/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17.inheritance;

class Person{
    public String name;
    public int age;
    
    void displayInfo1(){
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

class Student extends Person{                  //inheritance
    //name, age;
    public String university;
    
    void displayInfo2(){
        displayInfo1();
        System.out.println("University: " + university);
        System.out.println("\n");
    }
}

public class Inheritance {
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Murshid Mahmud";
        s1.age = 22;
        s1.university = "Diu";
        s1.displayInfo2();
        //s1.displayInfo1();
        
        Student s2 = new Student();
        s2.name = "Khadimul";
        s2.age = 21;
        s2.university = "Diu";
        s2.displayInfo2();
    }
    
}
