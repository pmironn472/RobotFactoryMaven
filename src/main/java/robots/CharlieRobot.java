package robots;

public class CharlieRobot extends BetaRobot {


    public CharlieRobot(String name, String model, int x, int y) {
        super(name, model, x, y);
    }


    public boolean moveDownLeft() {
        return super.checkCharge() && super.moveDown() && super.moveLeft();
    }

    public boolean moveDownRight() {
        return super.checkCharge() && super.moveDown() && super.moveRight();
    }

    public boolean moveUpLeft() {
        return super.checkCharge() && super.moveUp() && super.moveLeft();
    }

    public boolean moveUpRight() {
        return super.checkCharge() && super.moveUp() && super.moveRight();
    }
}
