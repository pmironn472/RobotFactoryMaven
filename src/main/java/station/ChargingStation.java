package station;


import intefraces.Has2DCoordinatesInterface;
import intefraces.HasBatteryInterface;

public class ChargingStation implements Has2DCoordinatesInterface, HasBatteryInterface {

    private byte battery;
    private int x;
    private int y;

    public ChargingStation(){ }

    public ChargingStation(byte battery,int x,int y) {
        setBattery(battery);
        setX(x);
        setY(y);
    }


    public void setCharge(int charge) {

    }


    public byte getCharge() {
        return 0;
    }

    public byte getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        if (battery >= 0 && battery <= 100)
            this.battery = (byte) battery;
        else System.err.println("Error Battery");
    }


    public void setX(int x) {
        this.x=x;

    }


    public int getX() {
        return x;
    }


    public void setY(int y) {
        this.y= y;
    }


    public int getY() {
        return y;
    }



}
