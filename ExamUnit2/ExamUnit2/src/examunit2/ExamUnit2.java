/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examunit2;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class ExamUnit2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
         int sum = 0;
        int[] array = new int[5];
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter the " + i + " number:");
            array[i] = ent.nextInt();
            sum += array[i];

        }
        System.out.print("The total sum is: " + sum);
    }

}