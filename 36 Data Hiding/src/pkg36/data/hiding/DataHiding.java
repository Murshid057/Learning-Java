/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg36.data.hiding;

class Rectangle{
    int length, breadth;
    
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class DataHiding {

    public static void main(String[] args) {
        
        Rectangle r = new Rectangle();
    }
}
