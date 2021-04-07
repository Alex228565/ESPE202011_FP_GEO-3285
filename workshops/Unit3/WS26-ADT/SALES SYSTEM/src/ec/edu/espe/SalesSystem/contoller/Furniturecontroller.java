/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SalesSystem.contoller;

import Utils.FileManager;
import ec.edu.espe.SalesSystem.model.Furniture;

/**
 *
 * @author martin lema
 */
public class Furniturecontroller {
    
    public void save(Furniture furniture){
    String data=furniture.getCode() +"," + furniture.getPrice()+ ","+ furniture.getSize()+" ,"+ furniture.getColors()+","+ furniture.getBrand()+","+ furniture.isCondition();
FileManager.save(data,"Furnitures");
    }
     public String read(){
        String data;
        data =FileManager.read("Furnitures");
        return data;
    }
    }




 

