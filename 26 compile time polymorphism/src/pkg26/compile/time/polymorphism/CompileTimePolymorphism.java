/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg26.compile.time.polymorphism;

class Overloading{
    void add(int a, int b){
        System.out.println("Sum = "+ (a+b));
    }
    void add(int a, int b, int c){
        System.out.println("Sum2 = "+ (a+b+c));
    }
    void add(){
        System.out.println("NO Sumation");
    }
    
}
public class CompileTimePolymorphism {

    public static void main(String[] args) {
       
        Overloading obj = new Overloading();
        obj.add();
        obj.add(20, 30);
        obj.add(10, 02, 30);
        
    }
    
}
