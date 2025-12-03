/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg33.pkginterface.multiple;

interface A{
    void play();
}
interface B{
    void play();
}
class C implements A,B{
    public void play(){
        System.out.println("I play football");
        System.out.println("I play Cricket");
    }
}
public class InterfaceMultiple {

    public static void main(String[] args) {
        
        C c = new C();
        c.play();
    }
    
}
