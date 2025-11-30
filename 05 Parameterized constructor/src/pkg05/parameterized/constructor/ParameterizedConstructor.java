/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05.parameterized.constructor;

class Student{
    public String name;
    public int roll;
    
    Student(){                            //Default Constructor(No parameter used)
        System.out.println("NO Value");
    }
    
    Student(String n, int r){             //Parameterized constructor(parameter used)  
        name = n;
        roll = r;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println("\n");
    }
}
public class ParameterizedConstructor {

    public static void main(String[] args) {
        Student S = new Student("MUrshid", 02);   //Parameterized constructor called
        S.display();
        
        Student K = new Student("Khadi", 01);
        K.display();
        
        Student M = new Student();                 //Default constructor called
        M.display();
    }
    
}
