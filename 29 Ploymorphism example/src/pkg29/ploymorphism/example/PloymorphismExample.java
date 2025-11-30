/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg29.ploymorphism.example;

class Shape{
    double x,y;
    
    Shape(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    double area(){
        return 0;
    }
}

class Rectengle extends Shape{
    Rectengle(double x, double y){
        super(x,y);
    }
    
    @Override
    double area(){
        return x*y;
    }
}

class Triangle extends Shape{
    Triangle(double x, double y){
        super(x,y);
    }
    
    @Override
    double area(){
        return 0.5*x*y;
    }
}

public class PloymorphismExample {

    public static void main(String[] args) {
        
        Shape s = new Shape(0,0);
        System.out.println("Shape area is: " + s.area());
        
        s = new Rectengle(20,30);
        System.out.println("Rectengle area is: " + s.area());
        
        s = new Triangle(10,20);
        System.out.println("Triangle area is: " + s.area());                   
    }
    
}
