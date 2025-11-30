/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02.method;

class Student{
    public int Roll,Id;
    public String Name;
    
    void display(){                             //Method without Parameter
        System.out.println("Name is: "+Name);
        System.out.println("Roll is: "+Roll);
        System.out.println("Id is: "+Id);
    }
}

public class Method02 {
    public static void main(String[] args) {
        
        Student S = new Student();
        S.Name = "Murshid Mahmud";
        S.Roll = 02;
        S.Id = 822;
        S.display();
    }
}
