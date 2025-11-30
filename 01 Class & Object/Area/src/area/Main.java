/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area;

class Area {
    public double radius;
    public double base,height;
    
    public double circle_display(){
        return 3.1416* radius* radius;
    }
    
    public double triangle_display(){
        return 0.5*base*height;
    }
}
public class Main{
    public static void main(String[] args) {
        
        //Cicle area object & value
        Area C;
        C = new Area();
        C.radius = 45;
        C.circle_display();
        
        //Triangle area object & value
        Area T = new Area();
        T.base = 4;
        T.height= 10;
        T.triangle_display();
        
        System.out.println("Circle radius is: " + C.circle_display());
        System.out.println("Triangle area is: " + T.triangle_display());
    }
}

