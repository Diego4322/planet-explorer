package com.myproject;
 
//The RockyPlanet class is a subclass of Planet. It adds an attribute that tells if the planet supports life.
 
public class RockyPlanet extends Planet {
    private boolean hasLife; // Extra feature specific to rocky planets

    
     //Constructor — creates a RockyPlanet object and passes shared info to the superclass.//
     
    public RockyPlanet(String name, double size, double distanceFromSun, boolean hasLife) {
        super(name, size, distanceFromSun); // Call the Planet constructor
        this.hasLife = hasLife; // Set subclass-specific attribute
    }

    
     //displayInfo() — overrides the superclass method to include life information.//
     // public void display info calls the display info method from superclass planet 
     // which uses the inherited attributes name size and distance from sun
    @Override
    // I know there is a display info in the parent class but im intentionally replacing it with this new version for rocky planets. 
    //this is override
    public void displayInfo() {
        super.displayInfo(); // Print general planet details. Super is to call the superclass
        System.out.println("Type: Rocky Planet");
        System.out.println("Supports life: " + (hasLife ? "Yes" : "No"));
    }
}
