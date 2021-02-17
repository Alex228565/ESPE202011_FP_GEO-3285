/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base1, base2, height, Area, Median;
        Scanner sc = new Scanner(System.in);

        System.out.println("Jhon Castillo");
        System.out.println(" Please Enter First Base of a Trapezoid  ");
        base1 = sc.nextDouble();
        System.out.println(" Please Enter Second Base of a Trapezoid  ");
        base2 = sc.nextDouble();
        System.out.println(" Please Enter the Height of a Trapezoid ");
        height = sc.nextDouble();

        Area = 0.5 * (base1 + base2) * height;
        Median = 0.5 * (base1 + base2);

        System.out.format("\n The Area of a Trapezoid = %.2f\n", Area);
        System.out.format(" The Median of a trapezium = %.2f \n", Median);
    }

}
