/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg30.abstraction.pkgclass;

abstract class MobileUser{
    abstract void sendMassage();            //abstract class
}
class Murshid extends MobileUser{
    @Override
    void sendMassage(){
        System.out.println("Hi,Murshid");
    }
}
class Mizanur extends MobileUser{
    @Override
    void sendMassage(){
        System.out.println("Hi.Mizanur Rahman");
    }
}
public class AbstractionClass {

    public static void main(String[] args) {
        
        MobileUser ms;                    //abstract class object create kora jay na
        
        ms = new Murshid();
        ms.sendMassage();
        
        ms = new Mizanur();
        ms.sendMassage();
        
    }
    
}
