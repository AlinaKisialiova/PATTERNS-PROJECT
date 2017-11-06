package by.akisialiova.factory.method;

/**
 * Concrete product Car
 */
public class Car implements Vehicle {

    @Override
    public void info() {
        System.out.println("Let's drive!");
    }
}
