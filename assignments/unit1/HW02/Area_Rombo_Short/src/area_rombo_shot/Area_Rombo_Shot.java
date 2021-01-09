/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_rombo_shot;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Area_Rombo_Shot {
    static Scanner entry = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short n1, n2;
        System.out.println("please enter one side: ");
        n1 = (short) entry.nextInt();
        System.out.println("please enter the angle: ");
        n2 = (short) entry.nextInt();
        System.out.println("The area of ​​the rhombus is: " + (n1 * n1 * Math.sin(n2)));
    }
    
}
