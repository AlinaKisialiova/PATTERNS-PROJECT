package by.akisialiova.singleton;

public class HiddenSingleton {

    private static int counter;

    private HiddenSingleton(){}

    public synchronized void increment(){
        counter++;
    }

    public static synchronized int getInstance(){
        return counter;
    }
}
