/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxdeclarations;
import ec.edu.espe.tax.BasicTax;
import java.util.Scanner;



/**
 *
 * @author Alex
 */
public class TaxDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price;
        float totalprice;
        float ivaValue;
        final float ivaPercentage = 12;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("----Castillo Jhon Taxes ----");
        System.out.println("IVA --> " );
        System.out.println("Enter the price of your products");
       price = input.nextFloat();
       
       ivaValue = BasicTax.computeIva(price, ivaPercentage);
      totalprice = price + ivaValue;
      
        System.out.println("total price " + totalprice);
       
        
    }
    
}
