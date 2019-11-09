package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO10;

import java.time.LocalTime;
import java.util.Objects;

public class Airline {
    private String destinationName;
    private int flightNumber;
    private String typeOfAircraft;
    private LocalTime departureTime;
    private String daysOfTheWeek;

    public Airline(String destinationName, int flightNumber, String typeOfAircraft, LocalTime departureTime, String daysOfTheWeek) {
        this.destinationName = destinationName;
        this.flightNumber = flightNumber;
        this.typeOfAircraft = typeOfAircraft;
        this.departureTime = departureTime;
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(String daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destinationName='" + destinationName + '\'' +
                ", flightNumber=" + flightNumber +
                ", typeOfAircraft='" + typeOfAircraft + '\'' +
                ", departureTime=" + departureTime +
                ", daysOfTheWeek='" + daysOfTheWeek + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return flightNumber == airline.flightNumber &&
                Objects.equals(destinationName, airline.destinationName) &&
                Objects.equals(typeOfAircraft, airline.typeOfAircraft) &&
                Objects.equals(departureTime, airline.departureTime) &&
                Objects.equals(daysOfTheWeek, airline.daysOfTheWeek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationName, flightNumber, typeOfAircraft, departureTime, daysOfTheWeek);
    }
}
