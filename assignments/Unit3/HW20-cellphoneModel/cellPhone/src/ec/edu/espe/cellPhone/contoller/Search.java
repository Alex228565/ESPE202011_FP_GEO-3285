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
public class Search {
    public static int Searcherr(String[]cellPhone, String findcellPhones) {
        
  int n = cellPhone.length;
        for (int i = 0; i < n ; i++) {
           
            if (findcellPhones == null ? (cellPhone[i]) == null : findcellPhones.equals(cellPhone[i])){
                return 1;
            }
        }
        return -1;
    }

}