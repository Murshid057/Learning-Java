/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13.method.overload;

class Overload{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add(){
        System.out.println("NO Answer overload");
    }
}

public class MethodOverload {

    public static void main(String[] args) {
        
        Overload ob = new Overload();
        ob.add(5,4);
        ob.add(4, 5, 9);
        ob.add();
        
    }
    
}
