package com.myproject;
import java.util.Random; 

// Import Random class to generate random facts


 // The Planet class represents a general planet with basic information. It serves as the superclass for other specific planet types.//
 
public class Planet {
    // Private attributes (data is hidden for encapsulation)
    private String name;
    private double size; // Planet size in Earth radii
    private double distanceFromSun; // Distance from the Sun in million kilometers

    
     // Constructor — initializes a Planet object with its name, size, and distance.
     
    public Planet(String name, double size, double distanceFromSun) {
        this.name = name;
        this.size = size;
        this.distanceFromSun = distanceFromSun;
    }

    // Getter methods allow other classes to access private variables safely.
    public String getName() { return name; }
    public double getSize() { return size; }
    public double getDistanceFromSun() { return distanceFromSun; }

    
     // generateRandomFact() — returns a random fact about the planet.
     // Uses the Random class to choose a random fact from a String array.
     
    public String generateRandomFact() {
        // Array of possible facts about planets
        String[] facts = {
            "This planet has extreme weather.",
            "It may have hidden oceans.",
            "Its surface is covered in storms.",
            "It rotates faster than Earth."
        };
        Random rand = new Random(); // Create a Random object
        int index = rand.nextInt(facts.length); // Pick a random number within the array length
        return facts[index]; // Return the randomly chosen fact
    }

    
     // calculateTravelTime() — calculates travel time to this planet.
     // Uses the formula: time = distance / speed.
     // The Math class is used for rounding the result.
     
    public double calculateTravelTime(double speed) {
        double distanceKm = distanceFromSun * 1_000_000; // Convert million km to km
        double timeHours = distanceKm / (speed * 3600); // Convert seconds to hours
        return Math.round(timeHours * 100.0) / 100.0; // Round to two decimal places
    }

    
     // displayInfo() — prints basic details about the planet.
     // Subclasses will override this method to add extra details.
     
    public void displayInfo() {
        System.out.println("\n--- Planet Info ---");
        System.out.println("Name: " + name);
        System.out.println("Size (Earth radii): " + size);
        System.out.println("Distance from Sun (million km): " + distanceFromSun);
    }
}
