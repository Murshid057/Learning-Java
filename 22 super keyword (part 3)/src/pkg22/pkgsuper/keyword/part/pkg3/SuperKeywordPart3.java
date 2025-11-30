/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22.pkgsuper.keyword.part.pkg3;

//Call super class Constructor;
class A{
    A(){
        System.out.println("A is constructor");
    }
}

class B extends A{
    B(){
        super();                                 //supper keyword
        System.out.println("B is constructor");
    }
}

public class SuperKeywordPart3 {

    public static void main(String[] args) {
        
        B obj = new B();
    }
    
}
