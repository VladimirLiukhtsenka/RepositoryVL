package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2.beans;

import java.util.Objects;

public class Car {
    private Engine engine;
    private Wheel wheel;
    private String carModel;

    public Car(String engineType, String wheelType, String carModel) {
        this.engine = new Engine(engineType);
        this.wheel = new Wheel(wheelType);
        this.carModel = carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(engine, car.engine) &&
                Objects.equals(wheel, car.wheel) &&
                Objects.equals(carModel, car.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, wheel, carModel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheel=" + wheel +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
