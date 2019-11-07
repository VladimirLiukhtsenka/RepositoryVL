package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.logic;

import by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.bean.Point;
import by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.bean.Triangle;

public class TriangleLogic {
    public double triangleSquare(Triangle triangle) {
        double p = (this.trianglePerimeter(triangle)) / 2;
        return Math.sqrt(p * (p - triangle.getSideAB()) * (p - triangle.getSideBC()) * (p - triangle.getSideCA()));
    }

    public double trianglePerimeter(Triangle triangle) {
        return triangle.getSideAB() + triangle.getSideBC() + triangle.getSideCA();
    }

    public Point intersectingMedians(Triangle triangle) {
        double x = (triangle.getPointA().getX() + triangle.getPointB().getX() + triangle.getPointC().getX()) / 3;
        double y = (triangle.getPointA().getY() + triangle.getPointB().getY() + triangle.getPointC().getY()) / 3;
        Point intersectingMedians = new Point(x, y);
        return intersectingMedians;
    }
}
