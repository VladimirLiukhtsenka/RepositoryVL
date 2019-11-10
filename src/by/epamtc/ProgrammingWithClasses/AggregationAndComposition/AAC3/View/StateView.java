package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3.View;

import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3.beans.Region;
import by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3.beans.State;

public class StateView {
    private State state;

    public StateView(State state) {
        this.state = state;
    }

    public void printCapital() {
        System.out.println("Cтолица государства " + state.getNameOfState() + " - " + state.getNamecapital());
    }

    public void printQuantityOfRegions() {
        System.out.println("Страна имеет " + state.getRegions().size() + " областей");
    }

    public void printSquareOfState() {
        double square = state.getCapitalSquare();
        for (Region region : state.getRegions()) {
            square += region.getSquare();
        }
        System.out.println("Общая площадь: " + square + " тыс.км2");
    }

    public void printCenterOfRegions() {
        System.out.print("Областные центры: ");
        for (Region region : state.getRegions()) {
            System.out.print(region.getRegionCenter().getName() + " ");
        }
    }
}
