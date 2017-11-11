package by.akisialiova.adapter.composition;

import by.akisialiova.adapter.Socket;
import by.akisialiova.adapter.SocketAdapter;
import by.akisialiova.adapter.Volt;

public class SocketObjectAdapterImpl implements SocketAdapter{

    Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt120 = socket.getVolt();
        return convertVolt(volt120, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt120 = socket.getVolt();
        return convertVolt(volt120, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
