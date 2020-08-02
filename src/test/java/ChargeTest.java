import org.junit.jupiter.api.Test;
import robots.BetaRobot;
import robots.RobotFactory;


import static org.junit.jupiter.api.Assertions.*;


public class ChargeTest {

    private BetaRobot robot = (BetaRobot) RobotFactory.getInstance().getRobot("beta", "mark2");


    @Test
    public void setChargeNegative() {
        robot.setCharge(-100);

        assertFalse(robot.getCharge() < -100, "test failed negative");

    }

    @Test
    public void setChargePositive() {
        robot.setCharge(1000);

        assertFalse(robot.getCharge() > 100, "test failed positive");
    }


    @Test
    public void chargeLevel(){
        robot.setCharge(50);

        while(robot.getCharge() > 5 ) {
            assertTrue(robot.moveRight(), "the charge");
        }
        System.out.println(robot.getCharge());
    }
}

