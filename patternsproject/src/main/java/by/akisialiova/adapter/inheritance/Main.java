package by.akisialiova.adapter.inheritance;

import by.akisialiova.adapter.SocketAdapter;
import by.akisialiova.adapter.Volt;

/**
 * The ADAPTER is a structural design pattern that provides for the collaboration of classes with incompatible interfaces.
 * + Separates and hides from the client the details of the transformation of various interfaces.
 * - Complicates the program code due to of additional classes.
 * 
 *  Class Adapter Implementation(java inheritance).
 */
public class Main {

    public static void main(String[] args) {
        SocketAdapter adapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(adapter, 3);
        Volt v12 = getVolt(adapter, 12);
        Volt v120 = getVolt(adapter, 120);
        System.out.println("v3 volts using Class Adapter = " + v3.getVolts());
        System.out.println("v12 volts using Class Adapter = " + v12.getVolts());
        System.out.println("v120 volts using Class Adapter = " + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter adapter, int i) {
        switch (i){
            case 3: return adapter.get3Volt();
            case 12: return adapter.get12Volt();
            default: return adapter.get120Volt();
        }
    }
}
