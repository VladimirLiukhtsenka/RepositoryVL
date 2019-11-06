package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO2;

public class Test2 {
    private double a;
    private double b;

    public Test2(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Test2() {
        this.a = 1;
        this.b = 1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
}
