/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SalesSystem.model;

/**
 *
 * @author martin lema
 */
public class Furniture {

    private int code;
    private int price;
    private String size;
    private String colors;
    private String Brand;
    private boolean condition;

    public Furniture(int code, int price, String size, String colors, String Brand, boolean condition) {
        this.code = code;
        this.price = price;
        this.size = size;
        this.colors = colors;
        this.Brand = Brand;
        this.condition = condition;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the colors
     */
    public String getColors() {
        return colors;
    }

    /**
     * @param colors the colors to set
     */
    public void setColors(String colors) {
        this.colors = colors;
    }

    /**
     * @return the Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * @return the condition
     */
    public boolean isCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(boolean condition) {
        this.condition = condition;
    }
}
