package robots;

public class AlphaRobot extends  AbstractRobot {
    private String name;
    private String model;
    private int x;
    private int y;

    public AlphaRobot(String name, String model, int x, int y) {
        setName(name);
        setModel(model);
        setX(x);
        setY(y);
    }



    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else
            System.err.println("Error Name");
    }

    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        } else
            System.err.println("Error Model");
    }


    public void setX(int x) {
        if (x >= 0 && x <= 100)
            this.x = x;
        else
            System.err.println("Error X");
    }

    public void setY(int y) {
        if (y >= 0 && y <= 100)
            this.y = y;
        else
            System.err.println("Error Y");
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public boolean moveRight() {
        if (getX() < 100) {
            setX(getX() + 1);
            return true;
        } else
            return false;
    }


    public boolean moveLeft() {
        if (getX() > 0) {
            setX(getX() - 1);
            return true;
        } else
            return false;
    }


    public boolean moveDown() {
        if (getY() < 100) {
            setY(getY() + 1);
            return true;
        } else
            return false;
    }


    public boolean moveUp() {
        if (getY() > 0) {
            setY(getY() - 1);
            return true;
        } else
            return false;
    }



    public void setCharge(int charge) {

    }


    public byte getCharge() {
        return 0;
    }


    public byte getBattery() {
        return 0;
    }


    public void setBattery(int battery) {

    }

}
