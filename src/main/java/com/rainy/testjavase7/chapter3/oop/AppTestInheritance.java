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
public class AppTestInheritance {

    public static void main(String[] args) {

        Car myCar, myTruck, myPickup;

//        Car myCar = new Car();
//        myCar.setBrand("Honda");
//        myCar.setColor(Color.BLUE);
//        myCar.setDoor(4);
        myCar = createCar(new Car(), "Honda", Color.BLUE, 4);

//        Pickup myPickup = new Pickup();
//        myPickup.setBrand("ISUZU");
//        myPickup.setColor(Color.PINK);
//        myPickup.setDoor(2);
        myPickup = createCar(new Pickup(), "ISUZU", Color.PINK, 2);

//        Truck myTruck = new Truck();
//        myTruck.setBrand("Hyundai");
//        myTruck.setColor(Color.BLACK);
//        myTruck.setDoor(2);
        myTruck = createCar(new Truck(), "Hyundai", Color.BLACK, 2);
        
        println();
        
        myCar.run();
        myPickup.run();
        myCar.stop();
        myTruck.run();
        myPickup.stop();
        myTruck.stop();

        println();
        
        print(myCar.getClass(), myCar.getBrand());
        print(myPickup.getClass(), myPickup.getBrand());
        print(myTruck.getClass(), myTruck.getBrand());
    }

    private static Car createCar(Car car, String brand, Color color, Integer door) {
        car.setBrand(brand);
        car.setColor(color);
        car.setDoor(door);
        return car;
    }
    
    private static void print(Class clazz, String text){
        System.out.println("The " + clazz.getSimpleName() + "'s brand is " + text);
    }
    
    private static void println(){
        System.out.println("\n------------------------------");
    }
}
