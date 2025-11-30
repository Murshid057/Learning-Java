/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg08.pkgstatic.variable;

class Student{
    static int count =0;
    
    Student(){
        count++;
    }
    
    void display(){
        System.out.println("Total Student: " + count);
    }
}
public class static_variable_part03 {
    public static void main(String[] args) {
        
        Student S1 = new Student();
        S1.display();
        
        Student S2 = new Student();
        S2.display();
        
        Student S3 = new Student();
        S2.display();
        
        Student S4 = new Student();
        S2.display();
    }
}
