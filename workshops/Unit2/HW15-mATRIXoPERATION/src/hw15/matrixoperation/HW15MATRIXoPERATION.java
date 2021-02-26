/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

/**
 *
 * @author Alex
 */
public class HW15MATRIXoPERATION {

    public static void main(String[] args) {
        int[][] matrixA = {
            {4, 5, 1},
            {1, 1, 9},
            {2, 7, 8},};
        int[][] matrixB = {
            {3, 9},
            {7, 8},
            {4, 5},};

        int[][] product = new int[matrixB.length][matrixB[0].length];
        for (int a = 0; a < matrixB[0].length; a++) {
            for (int i = 0; i < matrixA.length; i++) {
                int sum = 0;
                for (int j = 0; j < matrixA[0].length; j++) {
                    sum += matrixA[i][j] * matrixB[j][a];
                }
                product[i][a] = sum;
            }
        }
        System.out.print("Printing the product\n");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                System.out.printf("%d ", product[i][j]);
            }
            System.out.print("\n");
        }
    }
}
