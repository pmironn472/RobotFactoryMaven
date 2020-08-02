import org.junit.jupiter.api.Test;
import robots.BetaRobot;
import robots.RobotFactory;
import station.ChargingStation;
import station.StationFactory;

import static org.junit.jupiter.api.Assertions.*;

public class Charging {

    private BetaRobot robot = (BetaRobot) RobotFactory.getInstance().getRobot("beta", "mark3", 10, 10);
    private ChargingStation station = new ChargingStation((byte) 100, 10, 10);


    @Test
    public void chargeTest1() {
        robot.setY(20);
        robot.setX(20);
        robot.setCharge(10);

        assertFalse(station.getY() == robot.getY() && station.getX() == robot.getX() && StationFactory.charge(station, robot), "Charge test Failed");

    }


    @Test
    public void chargeTest4() {
        robot.setCharge(100);

        assertTrue(StationFactory.getInstance().charge(station, robot), "Charge test failed robot battery is full");

    }

    @Test
    public void chargheTest5(){
        robot.setCharge(50);

        while (robot.getCharge() != 100) {
            assertFalse(!StationFactory.getInstance().charge(station, robot), "charge station is not working");
        }
    }

    @Test
    public void chargeTest6(){
        robot.setY(10);
        robot.setX(10);


        assertFalse(!(station.getY() == robot.getY() && station.getX() == robot.getX()), "Charte 2.1 test failed");
    }

}



