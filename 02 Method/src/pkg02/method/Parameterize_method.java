/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02.method;

class Student{
    public String name;
    public int roll;
    
    void information(String n, int r){      //Parameterize Method
        name =n;
        roll = r;
    }
    
    void display(){
        System.out.println("Name is: "+name);
        System.out.println("Roll is: "+roll);
        System.out.println("\n");
    }
}

public class Parameterize_method {
    public static void main(String[] args) {
        
        Student S = new Student();
        S.information("Murshid",02);
        S.display();
        
        Student S1 = new Student();
        S1.information("Mamun", 03);
        S1.display();
    }
}
