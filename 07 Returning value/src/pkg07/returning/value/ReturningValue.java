/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07.returning.value;

class ReturningValueDemo{
    int square(int value){
        return value*value;            //Returning a value method
    }
}
public class ReturningValue {

    public static void main(String[] args) {
        ReturningValueDemo R = new ReturningValueDemo();
        int result = R.square(5);
        System.out.println("Answer is: " +result);
    }
    
}
