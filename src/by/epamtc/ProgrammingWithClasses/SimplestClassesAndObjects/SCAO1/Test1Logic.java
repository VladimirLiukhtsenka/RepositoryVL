package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO1;

public class Test1Logic {
    public double sum(Test1 test1) {
        return test1.getA() + test1.getB();
    }

    public double max(Test1 test1) {
        return (test1.getA() >= test1.getB()) ? test1.getA() : test1.getB();
    }
}
