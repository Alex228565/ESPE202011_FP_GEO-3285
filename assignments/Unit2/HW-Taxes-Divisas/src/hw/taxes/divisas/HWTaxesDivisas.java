/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.taxes.divisas;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class HWTaxesDivisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valor;
       double porcentaje;
       double total;
       double ISD;
       Scanner input = new Scanner(System.in);
       CalculateISD  calculating = new CalculateISD ();
       System.out.println("-- Jhon Castillo --");
       System.out.println("-- Calculator to ISD --");
       System.out.println("Enter to valor");
       valor = input.nextDouble();
 
       System.out.println("Enter porcentaje to ISD");
       porcentaje = (int) input.nextDouble();
       ISD = calculating.ObtainISD(valor, porcentaje);
       total = valor + ISD;
       
       System.err.println("Base: " + valor);
       System.err.println("ISD: " + ISD);
       System.err.println("Total: " + total);
  
    }
    private static class CalculateISD  {

        public CalculateISD () {
        }

        private double ObtainISD(double base, double porcentaje) {
            return 0.015;
            
           }
    }
    
}
