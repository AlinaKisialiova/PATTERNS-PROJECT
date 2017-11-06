package by.akisialiova.factory.method;

/**
 * Concrete creator of Product "Boat"
 */
public class BoatFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Boat();
    }
}
