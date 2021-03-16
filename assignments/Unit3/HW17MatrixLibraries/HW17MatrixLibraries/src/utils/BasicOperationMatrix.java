/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class BasicOperationMatrix {

    public static float addTwoMatrix(float matrixa, float matrixb) {
        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int matrizc[][] = new int[3][3];
        int i, j;

        Scanner dato = new Scanner(System.in);

        System.out.println("Datos de la Matriz A :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Escribir valor " + i + " , " + j + " : ");
                matrix1[i][j] = dato.nextInt();
            }
        }

        System.out.println("Datos de la Matriz B :");

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print("Escribir valor " + i + " , " + j + " : ");
                matrix2[i][j] = dato.nextInt();
            }
        }

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                matrizc[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Matriz resultante de la suma :");
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(matrizc[i][j] + " ");
            }
            System.out.println("");

        }

    }

    public static float substractTwoMatrix(float minuend, float subtrahend) {
        int i, j, cont, resta;

        int matriza[][] = new int[3][3];

        int matrizb[][] = new int[3][3];

        cont = 0;

        Scanner teclado = new Scanner(System.in);

        for (i = 0; i <= 2; i++) {

            for (j = 0; j <= 2; j++) {

                System.out.print("Escribir valor de la matriz A " + i + " , " + j + " : ");

                matriza[i][j] = teclado.nextInt();

                cont = matriza[i][j];

            }

        }

        for (i = 0; i <= 2; i++) {

            for (j = 0; j <= 2; j++) {

                System.out.print("Write the value of the array B " + i + " , " + j + " : ");

                matrizb[i][j] = teclado.nextInt();

            }

        }

        System.out.println("The marix A is equal to:");

        for (i = 0; i <= 2; i++) {

            for (j = 0; j <= 2; j++) {

                System.out.print(matriza[i][j]);

            }

            System.out.println();

        }

        System.out.println("The matrix b equal to a :");

        for (i = 0; i <= 2; i++) {

            for (j = 0; j <= 2; j++) {

                System.out.print(matrizb[i][j]);

            }

            System.out.println();

        }

        System.out.println("La resta de la matriz A y la matriz B es igual a :");

        for (i = 0; i <= 2; i++) {

            for (j = 0; j <= 2; j++) {

                resta = matriza[i][j] - matrizb[i][j];

                System.out.print(resta);

            }

            System.out.println();

        }

    }

 
