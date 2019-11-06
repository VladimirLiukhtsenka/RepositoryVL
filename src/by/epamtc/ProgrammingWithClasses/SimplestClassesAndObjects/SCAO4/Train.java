package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO4;

import java.time.LocalTime;


public class Train {
    private String destinationName;
    private int trainNumber;
    private LocalTime departureTime;

    public Train(String destinationName, int trainNumber, LocalTime departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }


    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destinationName='" + destinationName + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime=" + departureTime +
                '}';
    }
}
