/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16.encapsulation;

class Person{
    private String name;
    private int age;
    
    public void setName(String name){
        this.name = name;                // this keyword; (this.variable_name)
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    
}
public class Encapsulation {

    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.setName("Murshid Mahmud");
        p1.setAge(22);
        System.out.println("Name is : " + p1.getName());
        System.out.println("Age is  : " + p1.getAge());
    }
    
}
