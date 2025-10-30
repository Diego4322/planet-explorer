package com.myproject;
//this is the superclass


public class planet {
    private String name;
    private int size;
    private int distance_from_sun;

    public planet(String name, int size, int distance_from_sun) {
        this.name = name;
        this.size = size;
        this.distance_from_sun = distance_from_sun;
    }
    public void startGame() {
        System.out.println(name + " is approaching!");
    }

    public void displayInfo() {
        System.out.println("Size: " + size + " Mi");
        System.out.println("Distance from the Sun: " + distance_from_sun + " AU");
    }

    
    public String getName() { return name; }
    public int getSize() { return size; }
    public int getDistance_from_sun() { return distance_from_sun; }

    
}