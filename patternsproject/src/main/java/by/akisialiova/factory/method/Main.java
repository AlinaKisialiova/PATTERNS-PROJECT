package by.akisialiova.factory.method;

import java.util.Random;

/**
 * The pattern FACTORY METHOD creates objects with different types with the same interface.
 *  + Create objects, regardless of their types and defining of the creation process.
 *  - Even for one object, you need to create an appropriate factory, which increases the code.
 */
public class Main {

    private static Vehicle vehicle;

    public static void main(String[] args) {
        configure();
        vehicle.info();
    }

    private static void configure() {
        Boolean isWater = new Random().nextBoolean();
        System.out.println("- Defining the surface... \n- Is water?\n- " + isWater);
        if (isWater) {
            vehicle = new BoatFactory().createVehicle();
        } else {
            vehicle = new CarFactory().createVehicle();
        }
    }
}