package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2;

import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2.View.CarView;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2.beans.Car;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2.logic.CarLogic;

/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("1.4 TSI", "BRIDGESTONE 215/65 R16", "Volkswagen Tiguan");
        CarView carView = new CarView();
        carView.printCarModel(car);
        CarLogic carLogic = new CarLogic(car);
        carLogic.checkWheel();
        carLogic.startCar();
        carLogic.checkFuelLevel();
        carLogic.drive();
    }
}
