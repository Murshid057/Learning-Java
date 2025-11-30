/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06.constructor.overloading;

class Student{
    String name,gender;
    int id;
    
    Student(){                                  //constructor Overloading
        System.out.println("No inforamation");
    }
    Student(String n, String g){
        name =n;
        gender = g;
    }
    Student(String n, String g, int i){
        name =n;
        gender = g;
        id =i;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(id);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {
        
        Student S = new Student();
        Student S1 = new Student ("Murshid", "Male");
        S1.display();
        Student S2 = new Student("Kalam","Male", 454544);
        S2.display();
    }
    
}
