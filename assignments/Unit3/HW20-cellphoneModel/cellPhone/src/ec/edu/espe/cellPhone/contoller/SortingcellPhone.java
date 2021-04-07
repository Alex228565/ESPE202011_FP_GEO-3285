/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellPhone.contoller;

/**
 *
 * @author martin lema
 */
public class SortingcellPhone {
     public String[] sortBycellPhone(String [] cellPhone) {
        int n = cellPhone.length;
        for (int i = 0; i < cellPhone.length; i++) {
            for (int j = i + 1; j <cellPhone.length; j++) {
                if (cellPhone[i].compareTo(cellPhone[j]) > 0) {
                    String temp = cellPhone[i];
                    cellPhone[i] = cellPhone[j];
                    cellPhone[j] = temp;
                }
            }
        }
        for (int i = 0; i <= cellPhone.length - 1; i++) {
            System.out.print(cellPhone[i] + ", ");
        }
        return cellPhone;
    }
}


