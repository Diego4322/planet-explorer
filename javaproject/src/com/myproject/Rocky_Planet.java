package com.myproject;
//this is the subclass
public class rocky_planet extends planet {
    private int distance_from_earth;
    private boolean life;

    public rocky_planet(String name, int size, int distance_from_sun, int distance_from_earth, boolean life) {
        super(name, size, distance_from_sun); // call rocky_planet constructor
        this.distance_from_earth = distance_from_earth;
        this.life = life;
    }
//this is under construction 👷‍♂️
    public void viewRocky_Planet_Life() {
        System.out.println("There is life on" + getName + " " + life());
        System.out.println(getName() + " is " + getDistance_from_sun() + " AU");
    }


    }
