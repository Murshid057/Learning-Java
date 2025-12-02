/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg31.pkgabstract.problem.solve;

abstract class Shape{
    double x,y;
    
    Shape(double x, double y){
        this.x = x;
        this.y = y;
    }
    abstract void area();
}

class Rectangle extends Shape{
    
    Rectangle(double x,double y){
        super(x,y);
    }
    @Override
    void area(){
        double result = x*y;
        System.out.println("Rectangle is: " + result);
    }
}

class Triangle extends Shape{
    
    Triangle(double x, double y){
        super (x,y);
    }
    @Override
    void area(){
        double result = 0.5*x*y;
        System.out.println("Triangle is: " + result);
    }
}

class Circule extends Shape{
    
    Circule(double r){
        super (r,r);
    }
    @Override
    void area(){
        double result = Math.PI *x *y;
        System.out.println("Circule is: " +result);
    }
}
public class AbstractProblemSolve {

    public static void main(String[] args) {
        
        Shape shape;
        
        shape = new Rectangle(20,30);
        shape.area();
        
        shape = new Triangle(10,50);
        shape.area();
        
        shape = new Circule(20);
        shape.area();
    }
    
}
