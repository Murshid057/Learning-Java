/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15.recursion;

class FactorialDemo{
    
    int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
public class Recursion {

    public static void main(String[] args) {
        
        FactorialDemo ob = new FactorialDemo();
        int result = ob.fact(5);                   //Recursive call
        System.out.println(result);
        
        int result2 = ob.fact(4);
        System.out.println(result2);
    }
    
}
