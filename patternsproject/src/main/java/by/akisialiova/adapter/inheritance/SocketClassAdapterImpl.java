package by.akisialiova.adapter.inheritance;

import by.akisialiova.adapter.Socket;
import by.akisialiova.adapter.SocketAdapter;
import by.akisialiova.adapter.Volt;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt120 = getVolt();
        return convertVolt(volt120, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt120 = getVolt();
        return convertVolt(volt120, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
