
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import robots.AlphaRobot;
import robots.RobotFactory;


import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    private AlphaRobot robot;

    @BeforeEach
    public void setUp() {
        robot = (AlphaRobot)RobotFactory.getInstance()
                .getRobot("alpha", "mark1");
    }

    @Test
    public void setNullname() {

        robot.setName("Charlie");

        assertNotEquals(null, robot.getName(), "test failed name");
    }


    @Test
    public void setNullModel() {
        robot.setModel(null);

        assertNotEquals(null, robot.getModel(), "test failed model");
    }


    /// X cannot be outside (0..100) negative
    @Test
    public void setXCannotBeOutsideNegative() {
        robot.setX(23);

        assertFalse(robot.getX() < 0, "Test failde  X cannot be outside negative ");

    }


    /// X cannot be outside (0..100) positive
    @Test
    public void setXCannotBeOutsidePositive() {
        robot.setX(1000);
        assertFalse(robot.getX() > 100, "Test failde  X cannot be outside positive");
    }


    /// Y cannot be outside (0..100) negative
    @Test
    public void setYCannotBeOutsideNegative() {
        robot.setY(-100);

        assertFalse(robot.getY() < 0, "Test failde  X cannot be outside negative ");

    }


    /// Y cannot be outside (0..100) positive
    @Test
    public void setYCannotBeOutsidePositive() {
        robot.setY(1000);
        assertFalse(robot.getY() > 100, "Test failde  X cannot be outside positive");
    }


    ////////////////// MOVEMENT/////////////////////


    @Test
    public void XmovingOutOfBoundNegative() {
        robot.setX(0);

        assertFalse(robot.moveLeft(), "test failed move left");

    }

    @Test
    public void XmovingOutOfBoundPositive() {
        robot.setX(100);

        assertFalse(robot.moveRight(), "test failed move right");

    }

    @Test
    public void YmovingOutOfBoundNegative() {
        robot.setY(0);

        assertFalse(robot.moveUp(), "test failed move up");

    }

    @Test
    public void YmovingOutOfBoundPositive() {
        robot.setY(100);

        assertFalse(robot.moveDown(), "test failed move down");

    }
}
