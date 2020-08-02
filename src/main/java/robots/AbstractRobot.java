package robots;


import intefraces.Has2DCoordinatesInterface;
import intefraces.HasBatteryInterface;
import intefraces.Moveable2DInterface;

public abstract class AbstractRobot implements Has2DCoordinatesInterface, Moveable2DInterface, HasBatteryInterface {
    public abstract void setName(String name);

    public abstract String getName();

    public abstract void setModel(String model);

    public abstract String getModel();


}

