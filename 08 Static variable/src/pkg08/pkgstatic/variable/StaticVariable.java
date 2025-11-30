/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08.pkgstatic.variable;

class Student{
    String name;
    int id;
    static String university = "DIU";
    
    Student (String n, int i){
        name = n;
        id = i;
    }
    
    void display(){
        System.out.println("Name is: "+ name);
        System.out.println("Id is: " + id);
        System.out.println("University is: "+ university);
        System.out.println("\n");
    }
}
public class StaticVariable {

    public static void main(String[] args) {
        
        Student S = new Student("Murshid", 02);
        Student K = new Student("Khadimul", 01);
        
        S.display();
        K.display();
    }
    
}
