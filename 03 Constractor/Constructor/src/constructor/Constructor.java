/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;

class Student{
    public String name;
    public int roll;
    
    Student(String n, int r){      //Constructor 
        name = n;
        roll = r;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println("\n");
    }
}
public class Constructor {
    public static void main(String[] args) {
       
        Student S = new Student("MUrshid", 02);  //Constructor Value
        S.display();
        
        Student K = new Student("Khadi", 01);
        K.display();
    }
    
}
