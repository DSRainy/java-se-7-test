/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rainy.testjavase7.chapter3.classfundamentals;

import java.awt.Color;

/**
 *
 * @author Rainy
 */
public class Car {

    private Color color;
    private String brand;
    
    public Car(){
        this.color = Color.BLUE;
        this.brand = "";
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
