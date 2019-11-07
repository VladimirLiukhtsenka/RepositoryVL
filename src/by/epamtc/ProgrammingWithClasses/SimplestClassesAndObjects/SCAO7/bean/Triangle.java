package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.bean;

import by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO7.logic.PointLogic;

public class Triangle {
    private PointLogic pointLogic = new PointLogic();
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private double sideAB;
    private double sideBC;
    private double sideCA;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.sideAB = pointLogic.distanceBetweenPoints(pointA, pointB);
        this.sideBC = pointLogic.distanceBetweenPoints(pointB, pointC);
        this.sideCA = pointLogic.distanceBetweenPoints(pointC, pointA);
    }

    public PointLogic getPointLogic() {
        return pointLogic;
    }

    public void setPointLogic(PointLogic pointLogic) {
        this.pointLogic = pointLogic;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public double getSideAB() {
        return sideAB;
    }

    public void setSideAB(double sideAB) {
        this.sideAB = sideAB;
    }

    public double getSideBC() {
        return sideBC;
    }

    public void setSideBC(double sideBC) {
        this.sideBC = sideBC;
    }

    public double getSideCA() {
        return sideCA;
    }

    public void setSideCA(double sideCA) {
        this.sideCA = sideCA;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                ", pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", sideAB=" + sideAB +
                ", sideBC=" + sideBC +
                ", sideCA=" + sideCA +
                '}';
    }
}
