/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04iterations;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class HW04Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Multiplication Tables : 12");
        int top=12;
        int product=0;
        int table = 12;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("12 * " + j + " = " + product);
    }
  
        }
    
}
