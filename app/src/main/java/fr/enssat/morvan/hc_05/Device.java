package fr.enssat.morvan.hc_05;

/**
 * Created by benjent on 03/02/18.
 */

public class Device {

    private String deviceName;
    private String address;
    private boolean connected;

    public Device(String name, String address, String connected){
        this.deviceName = name;
        this.address = address;
        if (connected == "true") {
            this.connected = true;
        }
        else {
            this.connected = false;
        }
    }

    public String getDeviceName() {
        return deviceName;
    }

    public boolean getConnected() {
        return connected;
    }

    public String getAddress() {
        return address;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

}
