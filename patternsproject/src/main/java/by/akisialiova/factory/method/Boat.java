package by.akisialiova.factory.method;

/**
 * Concrete product Boat
 */
public class Boat implements Vehicle {

    @Override
    public void info() {
        System.out.println("Let's swim!");
    }
}
