/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws10functions;

/**
 *
 * @author Alex
 */
public class WS10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int divd = 5;
        int divr = 10;
        float quotient = 0;
        int x = 0;
        int y = 0;
        
        quotient = divideTwoNumbers(divd, divr);
        System.out.println("Quotient of 5 and 10 is ->" + quotient);
        
        y = f(3);
        System.out.println("3^2 ->" + y);
        
        y = f(-3);
        System.out.println("-3^2 ->" + y);
        
        x = -1;
        y = f(x);
        System.out.println("The esquare of -> " + x + " <- id equal to -> " + y);

    }

    private static int f(int x) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static float divideTwoNumbers(int divd, int divr) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
