package by.akisialiova.singleton;

/**
 * + SafeThreading
 * - Eager loading
 */
public class EarlySingleton {

    private static EarlySingleton instance = new EarlySingleton();

    private EarlySingleton() {
    }

    public static EarlySingleton getInstance(){
        return instance;
    }
}
