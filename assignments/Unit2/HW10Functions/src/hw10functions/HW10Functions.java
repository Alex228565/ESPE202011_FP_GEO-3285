/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10functions;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int dividend;
        int divisor;
        float quotient = 0;
        int vareableX = 0;
        int vareableY = 0;
        int multiplicand;
        int product;
        int top = 12;
        
        System.out.println("---- Insert a Numbers for divd ----");
        dividend = input.nextInt();
        
        System.out.println("---- Insert a Numbers for divr ----");
        divisor = input.nextInt();
                
        
        quotient = divideTwoNumbers(dividend, divisor);

        System.out.println("---- Quotient is ---- " + quotient);

        System.out.println("---- Insert a Numbers for Fuction ----");
        vareableX = input.nextInt();
        vareableY = f(vareableX);
        System.out.println("---- The Square of -> " + vareableX + 
                " <- is equal to ----- " + vareableY);
        
        System.out.println("---- Insert a Numbers for Fuction ----");
        vareableX = input.nextInt();
        vareableY = g(vareableX);
        System.out.println("---- The Value of -> " + vareableX + 
                " <- is equal to ---- " + vareableY);
        
        System.out.println("---- Insert a Positive Numbers ----");
        multiplicand = input.nextInt();
        for (int multiplier = 1 ; multiplier <= top ; multiplier++){
            product = showTheMultiplicationTable (multiplicand, multiplier);
            System.out.println(multiplicand  + " x " + multiplier + " = " + product);
        }
}

    
    public static float divideTwoNumbers(int dividend, int divisor) {
        
        float quotient = 0.00F;

       
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }
    
    public static int showTheMultiplicationTable(int multiplicand, int multiplier){
        int product;
        
        product = multiplicand*multiplier;
        
        return product;
        
    }
    
}
