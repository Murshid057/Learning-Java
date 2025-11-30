/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkgstatic.block;


public class StaticBlock {
    
    static int id;
    static String name;
    
    static{                    //static block
        id = 02;
        name = "Murshid";
    }
    
    static void display(){
        System.out.println("id is: " + id);
        System.out.println("Name is: "+ name);
    }

    public static void main(String[] args) {
        
        StaticBlock.display();
    }
    
}
