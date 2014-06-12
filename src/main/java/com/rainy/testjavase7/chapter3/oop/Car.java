/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rainy.testjavase7.chapter3.oop;

import java.awt.Color;

/**
 *
 * @author Rainy
 */
public class Car {

    private Color color;
    private String brand;
    private Integer door;

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

    public Integer getDoor() {
        return door;
    }

    public void setDoor(Integer door) {
        this.door = door;
    }

    public Car() {
        System.out.println("This is class : " + this.getClass().getSimpleName());
    }

    public void run() {
        System.out.println(this.brand + " started");
    }

    public void stop() {
        System.out.println(this.brand + " stopped");
    }

}
