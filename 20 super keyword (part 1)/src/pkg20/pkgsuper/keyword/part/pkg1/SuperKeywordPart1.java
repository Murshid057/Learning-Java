/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20.pkgsuper.keyword.part.pkg1;

//Call super class instant varible;
class A{
    int x = 10;
}

class B extends A{
    //int x;
    int x = 20;
    
    void display(){
        System.out.println(x);
        System.out.println(super.x);          //super keyword
    }
}
public class SuperKeywordPart1 {

    public static void main(String[] args) {
        
        B b1 = new B();
        b1.display();
    }
    
}
