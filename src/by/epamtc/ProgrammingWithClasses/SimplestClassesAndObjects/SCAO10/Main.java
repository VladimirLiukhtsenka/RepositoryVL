package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO10;

import java.time.LocalTime;
import java.util.ArrayList;

/*
10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Airline> airlinesScedule = new ArrayList<>();
        airlinesScedule.add(new Airline("Warsaw", 12654, "Airbus A310",
                LocalTime.of(14, 20), "Monday, Friday"));
        airlinesScedule.add(new Airline("Moscow", 65345, "Boeing-737",
                LocalTime.of(18, 40), "Friday, Sunday"));
        airlinesScedule.add(new Airline("Vilnius", 78654, "Ty-134",
                LocalTime.of(10, 15), "Thursday, Friday"));
        airlinesScedule.add(new Airline("Warsaw", 62354, "Airbus A310",
                LocalTime.of(20, 20), "Wednesday"));
        airlinesScedule.add(new Airline("Tenerife South", 23431, "Boeing-737",
                LocalTime.of(11, 45), "Sunday"));
        FlightScedule flightScedule = new FlightScedule(airlinesScedule);
        FlightSceduleLogic flightSceduleLogic = new FlightSceduleLogic();
        FlightSceduleView flightSceduleView = new FlightSceduleView();
        System.out.println("список рейсов для заданного пункта назначения:");
        ArrayList<Airline> flightsForGivenDestination = flightSceduleLogic.flightsForGivenDestination(flightScedule,
                "Warsaw");
        flightSceduleView.printScedule(flightsForGivenDestination);
        System.out.println("\nсписок рейсов для заданного дня недели:");
        ArrayList<Airline> flightsForGivenDay = flightSceduleLogic.flightsForGivenDay(flightScedule, "Sunday");
        flightSceduleView.printScedule(flightsForGivenDay);
        System.out.println("\nсписок рейсов для заданного дня недели, время вылета для которых больше заданного:");
        ArrayList<Airline> flightsForGivenDayAndTime = flightSceduleLogic.flightsForGivenDayAndTime(flightScedule,
                "Friday", LocalTime.of(14, 30));
        flightSceduleView.printScedule(flightsForGivenDayAndTime);
    }
}
