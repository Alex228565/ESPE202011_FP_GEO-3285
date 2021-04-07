/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw19.arrays.numbers;

import javax.swing.JOptionPane;


public class HW19ArraysNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int[] NUMBERS = new int[10];
        for(int A=0;A < NUMBERS.length;A++){
            NUMBERS[A] = Integer.parseInt(JOptionPane.showInputDialog((A+1)+ "--------Number-------- :",0));
        }
        String CHAIN ="numbers spelled out of order \n";
        for(int A=0;A < NUMBERS.length;A++){
            CHAIN = CHAIN + NUMBERS[A] + " ";
        }
         Insercion(NUMBERS);
        CHAIN += "\n ordered list numbers";
        for(int i=0;i < NUMBERS.length;i++){
                CHAIN = CHAIN + "\n" +  NUMBERS[i] ;
            
        }
        JOptionPane.showMessageDialog(null,CHAIN);
 }
public static void Insercion (int[] numbers) {
      for (int A=1; A < numbers.length; A++) {
         int INSIDE = numbers[A];
          int LATER = A;
         while ((LATER > 0) && (numbers[LATER - 1] > INSIDE)){
              numbers[LATER] = numbers[LATER -1];
              LATER --;
          }
          numbers[LATER]=INSIDE;
      }
}
}