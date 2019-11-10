package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2.logic;

import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2.beans.Car;

import java.util.Scanner;

public class CarLogic {
    private Car car;

    public CarLogic(Car car1) {
        this.car = car1;
    }

    public void checkWheel() {
        System.out.println("Проверьте, пожалуйста, состояние колес. \nНужно заменить колесо? (yes/no):");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("(yes/no):");
            answer = sc.nextLine();
        }
        if (answer.equals("yes")) {
            WheelLogic wheelLogic = new WheelLogic();
            wheelLogic.changeWheel();
        }
    }

    public void startCar() {
        System.out.println("Заводим автомобиль...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EngineLogic engineLogic = new EngineLogic();
        engineLogic.on(car.getEngine());
    }

    public void checkFuelLevel() {
        System.out.println("Проверьте, пожалуйста, уровень топлива. \nНужно долить топливо? (yes/no):");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("(yes/no):");
            answer = sc.nextLine();
        }
        if (answer.equals("yes")) {
            System.out.println("Бак полный!");
        }
    }

    public void drive() {
        System.out.println("Готовы ехать? (yes/no):");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("(yes/no):");
            answer = sc.nextLine();
        }
        if (answer.equals("yes")) {
            WheelLogic wheelLogic = new WheelLogic();
            wheelLogic.rotateON(car.getWheel());
            System.out.println("Автомобиль начинает движение.");
        }
    }
}
