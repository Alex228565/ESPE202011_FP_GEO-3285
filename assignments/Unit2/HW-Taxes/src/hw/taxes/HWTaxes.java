/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.taxes;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class HWTaxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base;
        double percentaje;
        double total;
        double VAT;
        Scanner leer = new Scanner(System.in);
        CalculaIva calculador = new CalculaIva();
        System.out.println("----- Jhon Castillo -----");
        System.out.println("--Enter Base--");
        base = leer.nextDouble();

        System.out.println("-- Enter the VAT percetage --");
        percentaje = leer.nextDouble();
        VAT = calculador.obtenerIva(base, percentaje);
        total = base + VAT;

        System.err.println("Base: " + base);
        System.err.println("VAT: " + VAT);
        System.err.println("Total: " + total);
    }

}
