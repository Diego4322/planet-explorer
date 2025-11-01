package com.myproject;
 // The GasPlanet class is a subclass of Planet. It adds a new attribute — whether the planet has rings.

 public class GasPlanet extends Planet {
    private boolean hasRings; // Extra feature specific to gas planets

    
     //Constructor — creates a GasPlanet object and passes common info to the superclass (Planet).//
     
    public GasPlanet(String name, double size, double distanceFromSun, boolean hasRings) {
        super(name, size, distanceFromSun); // Call the Planet constructor
        this.hasRings = hasRings; // Set subclass-specific attribute
    }

    
     // displayInfo() — overrides the method in Planet to include ring information.
     
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass version to show basic planet info
        System.out.println("Type: Gas Planet");
        System.out.println("Has rings: " + (hasRings ? "Yes" : "No"));
    }
}
