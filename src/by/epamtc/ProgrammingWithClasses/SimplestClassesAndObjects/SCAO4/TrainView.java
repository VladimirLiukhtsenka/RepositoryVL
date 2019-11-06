package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO4;

import java.util.Scanner;

public class TrainView {

    public void printInformationOfTrain(Train[] trains) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter train number: ");
        int trainNumber = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < trains.length; i++) {
            if (trainNumber == trains[i].getTrainNumber()) {
                flag = true;
                System.out.println("Train{" +
                        "destinationName='" + trains[i].getDestinationName() + '\'' +
                        ", trainNumber=" + trains[i].getTrainNumber() +
                        ", departureTime=" + trains[i].getDepartureTime() +
                        '}');
            }
        }
        if (!flag) {
            System.out.println("There is no such train number!");
        }
    }
}
