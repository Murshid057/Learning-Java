/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg42.decimal.formate;
import java.text.DecimalFormat;
public class DecimalFormate {

    public static void main(String[] args) {
        
//        double x = 2.987343433;
//        System.out.printf("x = %.2f",x);
          
          DecimalFormat ob = new DecimalFormat("0.000");
          
          double x = 3.3493223;
          System.out.println("x = " + ob.format(x));
    }
    
}
