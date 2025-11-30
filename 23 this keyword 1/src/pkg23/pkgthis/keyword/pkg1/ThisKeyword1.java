/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23.pkgthis.keyword.pkg1;

class Person{
    String name;
    int age;
    String ocupation;
    
    Person(String name, int age){
        this.name = name;              //this keywor current class
        this.age = age;
    }
    
    Person(String name, int age, String ocupation){
        this(name,age);                //this keyword constructor
        this.ocupation = ocupation;
    }
    
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(ocupation);
    }
}

public class ThisKeyword1 {

    public static void main(String[] args) {
        
        Person p1 = new Person("Murshid", 22);
        p1.display();
        
        Person p2 = new Person("Kader",25,"Golden");
        p2.display();
       
    }
    
}
