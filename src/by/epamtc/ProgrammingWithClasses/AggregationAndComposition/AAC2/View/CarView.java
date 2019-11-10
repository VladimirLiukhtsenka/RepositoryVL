package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2.View;

import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2.beans.Car;

public class CarView {

    public void printCarModel(Car car) {
        System.out.println("Перед Вами автомобиль марки: " + car.getCarModel() + ".");
    }
}
