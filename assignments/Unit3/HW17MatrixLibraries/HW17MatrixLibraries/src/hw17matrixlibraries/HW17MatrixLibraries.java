/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17matrixlibraries;

import java.util.Scanner;
import utils.BasicOperationMatrix;

/**
 *
 * @author Alex
 */
public class HW17MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float matrix1;
        float matrix2;
        float matrix3;
        float result;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two numbers -->");
        matrix1 = input.nextFloat();
        matrix2 = input.nextFloat();
        matrix3 = input.nextFloat();
        System.out.println("----ADITION----");
        result = BasicOperationMatrix.addTwoNumbers(matrixa, matrixb);
        System.out.println(matrix1 + " + " + matrix2 + " + " + matrix3 + " + " + result);
        
        System.out.println("----SUBTRACTION----");
        result = BasicOperationMatrix.subtractTwoNumbers(matrix1, matrix2);
        System.out.println(matrix1 + " - " + matrix2 + " = " + result); 

    }
    
    }
    
