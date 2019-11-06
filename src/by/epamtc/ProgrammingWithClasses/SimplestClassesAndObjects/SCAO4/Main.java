package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO4;


import java.time.LocalTime;
import java.util.Arrays;


/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения,
причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */
public class Main {
    public static void main(String[] args) {
        Train[] schedule = new Train[5];
        schedule[0] = new Train("Vilnius", 134, LocalTime.of(10, 20));
        schedule[1] = new Train("Moscow", 153, LocalTime.of(20, 5));
        schedule[2] = new Train("Warsaw", 112, LocalTime.of(14, 30));
        schedule[3] = new Train("Kiev", 109, LocalTime.of(15, 0));
        schedule[4] = new Train("Warsaw", 14, LocalTime.of(12, 45));

        System.out.println("Данный массив:");
        System.out.println(Arrays.toString(schedule));

        System.out.println("Cортировка элементов массива по номерам поездов:");
        TrainLogic trainLogic = new TrainLogic();
        System.out.println(Arrays.toString(trainLogic.sortByTrainNumber(schedule)));

        System.out.println("Вывод информации о поезде, номер которого введен пользователем:");
        TrainView trainView = new TrainView();
        trainView.printInformationOfTrain(schedule);

        System.out.println("Cортировка массива по пункту назначения:");
        System.out.println(Arrays.toString(trainLogic.sortByDestinationName(schedule)));
    }
}
