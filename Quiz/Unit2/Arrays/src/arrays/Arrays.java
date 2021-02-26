/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int[] hardwareProducts;
        String[] products = {"Hammer", "ax","level", "screwdriver", "chisel", 
            "pliers", "scraper", "electric drill ", " tool box ",
            "pilers", "screw", "bolt"};
        float[] priceOfTheProduct = {5.50F, 0.30F, 2.55F, 3.00F, 0.43F, 0.30F,
            
            3.50F, 100F, 5.50F, 2.20F, 3.00F, 2.00F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Please Enter the name of product: ");
        n = input.nextInt();

        hardwareProducts = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Plese enter the product number " + (i + 1) + " : ");
            hardwareProducts[i] = input.nextInt();
        }

        for (int product : hardwareProducts) {
            System.out.println(" hardware Products " + product);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(" the price of the product " + (i + 1) + " : "
                    + hardwareProducts[i]);
        }

        for (String product : products) {
            System.out.println("the product name : " + product);
        }

        for (int i = 0; i < priceOfTheProduct.length; i++) {
            System.out.println(" the price of the product " + (i + 1) + " : "
                    + priceOfTheProduct[i]);
        }
    }
}
