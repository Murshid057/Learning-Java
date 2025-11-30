/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25.pkgfinal.keyword.pkg1;

class University{
    final String name = "Diu";         //final variable;
    final int fees = 37000;            //final variable;
    
    final int taka;                //blank final variable;
    
    University(){           //blank final variable call constructor;
        taka = 4000;
    }
    
    static final String person;       //static blank final variable;
    static{                           // call static block;
        person = "Murshid mahmud";
    }
    
    void display(){
        System.out.println(name);
        System.out.println(fees);
        System.out.println(taka);
        System.out.println(person);
    }
}
public class FinalKeyword1 {

    public static void main(String[] args) {
        
        University u1 = new University();
        u1.display();
    }
    
}
