package station;


import intefraces.HasBatteryInterface;

public class StationFactory {

    public static boolean charge(ChargingStation station, HasBatteryInterface chargeable) {

        while (station.getBattery() >= 5) {
            if (chargeable.getCharge() <= 100) {
                chargeable.setCharge(chargeable.getCharge() + 10);
                station.setBattery(station.getBattery() - 1);
            }
            return true;
        }
        return false;


    }

    private static class SingletonHolder {
        private final static StationFactory INSTANCE = new StationFactory();
    }

    public static StationFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }
}