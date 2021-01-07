/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperatos;

import static com.sun.javafx.util.Utils.sum;

/**
 *
 * @author Alex
 */
public class BasicOperatos {

    private static int sum;
    private static String remanider;
    private static int remanaider;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int addend1;
        int addend2;
        int minuend;
        int subtrahend;
        int product;
        int multiplicant;
        int multiplier;
        int dividend;
        int divisor;
        int quotient;
        int reminder;
        addend1 = 5;
        addend2 = 18;
        minuend = 23;
        subtrahend = -6;
        multiplicant = 8;
        multiplier = 12;
        dividend = 19;
        divisor = 7;
        
        sum = addend1 + addend2;
        
        System.out.println(" the addition of " + addend1 + " + " + addend2 + 
                " is equal to --> " + sum);
        
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        
        sum++;
        System.out.println(" adding one to sum " + sum);
        
        System.out.println(" adding one to sum " + (sum++));
        
        System.out.println(" adding one to sum " + (++sum));
        
        System.out.println("the substraction of " + minuend + " - " + subtrahend
                + " is equal to " + (minuend + subtrahend));
        
         product = multiplier * multiplicant;
        
        System.out.println("the multiplication of " + multiplier + " * "  
                + multiplicant + " is equal to --> " + product );
        
         quotient = dividend / divisor;
        
        System.out.println("the division of " + dividend + " / " + divisor
                + " is equal to --> " + remanider);
        
        remanaider = dividend % divisor ;
         
        System.out.println(" the division remaneider " + dividend + " % "
                + divisor + " is equal to --> " + remanaider);
    }
    
}
