package robots;

public class RobotFactory {

    private RobotFactory(){}

    public AbstractRobot getRobot(String model, String name) {
        return getRobot(model, name, 0, 0);
    }

    public AbstractRobot getRobot(String model, String name, int x, int y) {

        switch (model){

            case "alpha":
                return new AlphaRobot(name, model, x, y);

            case "beta":
                return new BetaRobot(name, model, x, y);

            case "charlie":
                return new CharlieRobot(name, model, x, y);

            default:
                System.err.println("Error model ");
                return null;
        }
    }

    private static class SingletonHolder {
        private final static RobotFactory INSTANCE = new RobotFactory();
    }

    public static RobotFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
