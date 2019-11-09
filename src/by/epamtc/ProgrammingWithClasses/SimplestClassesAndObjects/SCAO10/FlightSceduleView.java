package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO10;

import java.util.ArrayList;

public class FlightSceduleView {
    public void printScedule(ArrayList<Airline> scedule) {
        for (Airline airline : scedule) {
            System.out.println("Пункт назначения: " + airline.getDestinationName() + " номер рейса: " + airline.getFlightNumber()
                    + " тип самолета: " + airline.getTypeOfAircraft() + " время вылета: " + airline.getDepartureTime() +
                    " дни недели: " + airline.getDaysOfTheWeek());
        }
    }
}
