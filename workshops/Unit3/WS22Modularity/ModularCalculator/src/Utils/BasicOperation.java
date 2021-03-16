/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author Alex
 */
public class BasicOperation {

    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }

    public static float subtractTwoNumbers(float minuend, float subtrahend) {
        float subtraction = 0;
        subtraction = minuend - subtrahend;
        return subtraction;
    }
     public static float multiplyTwoNumbers(float operand1, float operand2) {
        float multiplication = 0;
        multiplication = operand1 * operand2;
        return multiplication;
}
     public static float divideTwoNumbers(float dividend, float divider) {
        float divison = 0;
        divison = dividend / divider;
        return divison;
     }
}
