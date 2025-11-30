/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.method;

class Area{
    public double radius;
    public double base,height;
    
    public double circle(){
        return 3.1416* radius* radius;
    }
    
    public double triangle(){
        return 0.5*base*height;
    }
    //Method syntex:
    void display(){                                          //Method
        System.out.println("Circle area is: "+ circle());
        System.out.println("Triangle area is: "+ triangle());
    }
}
public class Method {
    
    public static void main(String[] args) {
         //Cicle area object & value
        Area C;
        C = new Area();
        C.radius = 45;
        C.display();
        
        //Triangle area object & value
        Area T = new Area();
        T.base = 4;
        T.height= 10;
        T.display();
    }
    
}
