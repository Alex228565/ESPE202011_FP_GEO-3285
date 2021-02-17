/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.task.octagon;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class WSTaskOctagon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Jhon Castillo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of side of octagon: ");
        int side = sc.nextInt();
        float area = (float) (2 * (1 + Math.sqrt(2)) * side * side);
        System.out.println("Area of octagon is: " + area);
        sc.close();
    }

}
