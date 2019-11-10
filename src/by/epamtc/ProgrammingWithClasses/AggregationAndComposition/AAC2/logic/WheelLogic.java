package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2.logic;

import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2.beans.Wheel;

public class WheelLogic {


    public void rotateON(Wheel wheel) {
        System.out.println("Колеса вращаются.");
    }

    public void rotateOFF(Wheel wheel) {
        System.out.println("Колеса не вращаются.");
    }

    public void changeWheel() {
        System.out.println("Колесо заменено.");
    }
}
