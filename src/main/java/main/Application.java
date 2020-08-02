package main;


import robots.AbstractRobot;
import robots.BetaRobot;
import robots.RobotFactory;

public class Application {
    public static void main(String[] args) {



        AbstractRobot robot = RobotFactory.getInstance().getRobot("beta", "mark2");



        AbstractRobot IronMan32 = RobotFactory.getInstance().getRobot("charlie","mark3");


        System.out.println(robot);
        System.out.println(IronMan32);




    }
}
