package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO4;

import java.util.Arrays;

public class TrainLogic {
    public Train[] sortByTrainNumber(Train[] trains) {
        Train[] trains1 = Arrays.copyOf(trains, trains.length);
        for (int i = trains1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (trains1[j].getTrainNumber() > trains1[j + 1].getTrainNumber()) {
                    Train temp = trains1[j];
                    trains1[j] = trains1[j + 1];
                    trains1[j + 1] = temp;
                }
            }
        }
        return trains1;
    }

    public Train[] sortByDestinationName(Train[] trains) {
        Train[] trains1 = Arrays.copyOf(trains, trains.length);
        for (int i = trains1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (trains1[j].getDestinationName().compareTo(((trains1[j + 1].getDestinationName()))) > 0) {
                    Train temp = trains1[j];
                    trains1[j] = trains1[j + 1];
                    trains1[j + 1] = temp;
                } else if (trains1[j].getDestinationName().compareTo(((trains1[j + 1].getDestinationName()))) == 0) {
                    if (trains1[j].getDepartureTime().compareTo(((trains1[j + 1].getDepartureTime()))) > 0) {
                        Train temp = trains1[j];
                        trains1[j] = trains1[j + 1];
                        trains1[j + 1] = temp;
                    }
                }
            }
        }
        return trains1;
    }
}
