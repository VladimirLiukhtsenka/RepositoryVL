package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO1;

public class Test1 {
    private double a;
    private double b;

    public Test1() {
       this.a = 0;
       this.b = 0;
    }

    public Test1(double A, double B) {
        this.a = A;
        this.b = B;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
