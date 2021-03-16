/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Autor: Castillo Jhon :");
        double spped;
        System.out.println("Enter the number of sheets to print : ");
        spped = sc.nextDouble();
        System.out.println("The printing time in seconds is :");
        System.out.println(spped + " S -> " + spped * 100 / 36 + " s");
    }
    
}
