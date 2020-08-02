import org.junit.jupiter.api.Test;
import robots.CharlieRobot;
import robots.RobotFactory;


import static org.junit.jupiter.api.Assertions.*;

public class DiagonalWalkTest {

    private CharlieRobot robot = (CharlieRobot) RobotFactory.getInstance().getRobot("charlie","mark4");

    @Test
    public void rightDownDiagonalMove(){
        robot.setY(50);
        robot.setX(100);

        assertFalse(robot.moveDownRight(),"Diagonal moving test failed\nREASON: moveDownRight() out of bounds!");
    }


    @Test
    public void leftDownDiagonalMove(){
        robot.setY(50);
        robot.setX(100);

        assertFalse(robot.moveDownLeft(),"Diagonal moving test failed\nREASON: moveDownLeft() out of bounds!");
    }

    @Test
    public void upRightDiagonalMove(){
        robot.setY(50);
        robot.setX(0);

        assertFalse(robot.moveUpRight(),"Diagonal moving test failed\nREASON: moveDownLeft() out of bounds!");
    }

    @Test
    public void upLeftDiagonalMove(){
        robot.setY(0);
        robot.setX(50);

        assertFalse(robot.moveUpLeft(),"Diagonal moving test failed\nREASON: moveDownLeft() out of bounds!");
    }

    @Test
    public void downRightDiagonalMove(){
        robot.setY(100);
        robot.setX(50);

        assertFalse(robot.moveDownRight(),"Diagonal moving test failed\nREASON: moveDownLeft() out of bounds!");
    }

    @Test
    public void rightUpDiagonalMove(){
        robot.setY(50);
        robot.setX(100);

        assertFalse(robot.moveUpRight(),"Diagonal moving test failed\nREASON: moveDownLeft() out of bounds!");
    }

    @Test
    public void leftUpDiagonalMove(){
        robot.setY(50);
        robot.setX(0);

        assertFalse(robot.moveUpLeft(),"Diagonal moving test failed\nREASON: moveDownLeft() out of bounds!");
    }

    @Test
    public void downLeftDiagonalMove(){
        robot.setY(50);
        robot.setX(0);

        assertFalse(robot.moveDownLeft(),"Diagonal moving test failed\nREASON: moveDownLeft() out of bounds!");
    }

}
