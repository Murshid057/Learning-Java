/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg41.exception.problem;
import java.util.Scanner;

public class ExceptionProblem {

    public static void main(String[] args) {
        
        int count = 1;
        do {
            try{
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int x = input.nextInt();
                System.out.print("Enter the number2: ");
                int y = input.nextInt();

                int result = x / y;
                System.out.println("Result :" + x + "/" + y + " = " + result);
                count=2;
            } 
            catch (Exception e) {
                System.out.println("Exception:" + e);
                System.out.println("You must enter integer. Please try again.");
            }
           
        }while(count==1);
    }  
}
