/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void ShowTHeFacctorial(String[] args) {
        long factorial = 1;
        int num;
        Scanner number = new Scanner(System.in);
        System.out.println("----- Jhon Castillo ----");
        System.out.print("----- Enter the number ----- : ");
        num = number.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("----- The factorial of ----- "
                + "" + num + " es: " + factorial);
    }

}
