/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg40.exception.handling;

public class ExceptionHandling {

    public static void main(String[] args) {
        try{
            int x = 10;
            int y = 0;
            int div = x/y;
        System.out.println("div is: " + div);
        }
        catch(Exception e ){
            System.out.println("Something went wrong"+e);
        }
        finally{
            System.out.println("It's wrong");
        }
        System.out.println("Answer is Zero");
    }   
}
