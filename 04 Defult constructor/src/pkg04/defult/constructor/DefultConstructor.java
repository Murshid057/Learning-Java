/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04.defult.constructor;

class Student{
    public String name;
    public int roll;
    
    Student(){                            //Default Constructor(No parameter used)
        System.out.println("NO Value");
    }
    
    Student(String n, int r){     
        name = n;
        roll = r;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println("\n");
    }
}

public class DefultConstructor {

    public static void main(String[] args) {
        Student S = new Student("MUrshid", 02);  
        S.display();
        
        Student K = new Student("Khadi", 01);
        K.display();
        
        Student M = new Student();                 //Default constructor called
        M.display();
    }
    
}
