/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09.pkgstatic.method;

class Student{
    static void display(){                        //static Method
        System.out.println("I am static method");
    }
}

public class StaticMethod {

    public static void main(String[] args) {
        
        //call no object create
        
        Student.display();
    }
    
}
