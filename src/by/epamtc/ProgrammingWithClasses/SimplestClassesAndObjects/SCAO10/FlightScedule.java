package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO10;

import java.util.ArrayList;
import java.util.Objects;

public class FlightScedule {
    private ArrayList<Airline> flightScedule;

    public FlightScedule(ArrayList<Airline> flightSced) {
        this.flightScedule = flightSced;
    }

    public ArrayList<Airline> getFlightScedule() {
        return flightScedule;
    }

    public void setFlightScedule(ArrayList<Airline> flightScedule) {
        this.flightScedule = flightScedule;
    }

    @Override
    public String toString() {
        return "FlightScedule{" +
                "flightScedule=" + flightScedule +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightScedule that = (FlightScedule) o;
        return Objects.equals(flightScedule, that.flightScedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightScedule);
    }
}
