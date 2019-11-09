package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO10;

import java.time.LocalTime;
import java.util.ArrayList;

public class FlightSceduleLogic {

    public ArrayList<Airline> flightsForGivenDestination(FlightScedule flightSced, String destinationName) {
        ArrayList<Airline> fSL = new ArrayList<>();
        for (Airline airline : flightSced.getFlightScedule()) {
            if (airline.getDestinationName().contains(destinationName)) {
                fSL.add(airline);
            }
        }
        return fSL;
    }

    public ArrayList<Airline> flightsForGivenDay(FlightScedule flightSced, String day) {
        ArrayList<Airline> fSL = new ArrayList<>();
        for (Airline airline : flightSced.getFlightScedule()) {
            if (airline.getDaysOfTheWeek().contains(day)) {
                fSL.add(airline);
            }
        }
        return fSL;
    }

    public ArrayList<Airline> flightsForGivenDayAndTime(FlightScedule flightSced, String day, LocalTime departureTime) {
        ArrayList<Airline> fSL = new ArrayList<>();
        for (Airline airline : flightSced.getFlightScedule()) {
            if (airline.getDaysOfTheWeek().contains(day) && (airline.getDepartureTime().compareTo(departureTime) > 0)) {
                fSL.add(airline);
            }
        }
        return fSL;
    }
}
