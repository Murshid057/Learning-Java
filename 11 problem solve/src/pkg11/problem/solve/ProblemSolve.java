/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.problem.solve;

class Box{
    double height,width,depth;              // instance variable
    
    Box(double h, double w, double d){      // local variable
        height = h;
        width = w;
        depth = d;
    }
    
    void displaybox(){
        double box = height*width*depth;
        System.out.println("Box size is: " + box);
    }
}
public class ProblemSolve {

    public static void main(String[] args) {
        
        Box b1 = new Box(10,10,10);
        Box b2 = new Box(20,30,10);
        
        b1.displaybox();
        b2.displaybox();
    }
    
}
