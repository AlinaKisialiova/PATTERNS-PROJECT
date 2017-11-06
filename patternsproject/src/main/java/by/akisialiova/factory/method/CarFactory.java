package by.akisialiova.factory.method;

/**
 * Concrete creator of Product "Car"
 */
public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
