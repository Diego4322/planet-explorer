package com.myproject;
import java.util.Scanner; // Import Scanner for user input
import java.util.Random;  // Import Random for random planet generation


// The GalaxyExplorer class runs the program.
//It lets the user "visit" random planets and discover information about them.
 
public class GalaxyExplorer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // For reading user input
        Random rand = new Random(); // For creating random planet details

        // Ask the user for their spaceship speed
        System.out.print("Enter your spaceship speed (km/s): ");
        double speed = input.nextDouble(); // Store the user’s speed

        boolean exploring = true; // Control variable for the while loop

        // Keep exploring planets while the user wants to continue
        while (exploring) {
            Planet planet; // Declare a Planet variable (can hold any subclass type)

            // Randomly decide which type of planet to create: Gas or Rocky
            if (rand.nextBoolean()) {
                // Create a random GasPlanet
                planet = new GasPlanet("Zephyra", 9.5, 600, rand.nextBoolean());
            } else {
                // Create a random RockyPlanet
                planet = new RockyPlanet("Terrion", 1.2, 150, rand.nextBoolean());
            }

            // Display planet info (calls overridden method in subclasses)
            planet.displayInfo();

            // Calculate and display the travel time based on user speed
            System.out.println("Travel time: " + planet.calculateTravelTime(speed) + " hours");

            // Display a random fact about the planet
            System.out.println("Fun fact: " + planet.generateRandomFact());

            // Ask the user if they want to explore another planet
            System.out.print("\nWould you like to visit another planet? (yes/no): ");
            String answer = input.next();

            // If the user types "yes", the loop repeats
            exploring = answer.equalsIgnoreCase("yes");
        }

        // Close the Scanner to free resources
        input.close();
        System.out.println("Thanks for exploring!");
    }
}
