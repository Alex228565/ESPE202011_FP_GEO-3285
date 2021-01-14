/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03iterations;

import static javafx.scene.input.KeyCode.P;

/**
 *
 * @author Alex
 */
public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("first 5 even numbers ");
        int j = 2;
        while ( j <= 10 ){ 
            System.out.println(j + " -> is even");
            j +=2; 
        }
      
        for(int i = 0; i  <= 12; i = i + 2 ){
            System.out.println(i);
        }
        System.out.println("End of cycle ");
    }
    
}
