/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class HW14 {

    private static Iterable<String> brands;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int[] beberageBrands;
        String[] beberage = {" Coca-Cole", " Sprite ", " Pepsico"};
        float[] weightsBybeberage = { 1.2F, 2.4F, 45.2F, 80.1F, 4.3F, 4.5F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of beberaje : ");
        n = input.nextInt();

        beberageBrands = new int[n];
        //chickens = new String[20];
        //weightsByCoop = new float[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of beberage of the brands " + (i + 1) + " -> ");
            beberageBrands[i] = input.nextInt();
        }

        for (int eggs : beberageBrands) {
     String beberages = null;
            System.out.println("beberage brands are " + beberages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("beberage brands are " + (i + 1) + " -> " + beberageBrands[i]);
        }


        for (String Brands : brands) {
            System.out.println("brands name -> " + brands);
        }
    }
    
}
