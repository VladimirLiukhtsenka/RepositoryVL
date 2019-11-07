package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.logic;

import by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.bean.Point;

public class PointLogic {

    public double distanceBetweenPoints(Point one, Point two) {
        return Math.sqrt(Math.pow((one.getX() - two.getX()), 2) + Math.pow((one.getY() - two.getY()), 2));
    }
}
