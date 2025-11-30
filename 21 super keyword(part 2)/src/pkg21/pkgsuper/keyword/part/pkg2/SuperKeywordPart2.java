/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg21.pkgsuper.keyword.part.pkg2;

//Cass super class method(overridden method);
class A{
    void display(){
        System.out.println("Inside A class");
    }
}

class B extends A{
    //display;
    
    @Override
    void display(){
        super.display();                        //super keyword
        System.out.println("Inside B class");
    }
}
public class SuperKeywordPart2 {

    public static void main(String[] args) {
        
        B b1 = new B();
        b1.display();
    }
    
}
