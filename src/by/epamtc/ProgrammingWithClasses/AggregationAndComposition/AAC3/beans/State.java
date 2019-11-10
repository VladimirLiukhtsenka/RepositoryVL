package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3.beans;

import java.util.ArrayList;
import java.util.Objects;

public class State {
    private String nameOfState;
    private String namecapital;
    private double capitalSquare;
    private ArrayList<Region> regions;

    public State(String nameOfState, String namecapital, double capitalSquare, ArrayList<Region> regions) {
        this.nameOfState = nameOfState;
        this.namecapital = namecapital;
        this.capitalSquare = capitalSquare;
        this.regions = regions;
    }

    public String getNameOfState() {
        return nameOfState;
    }

    public void setNameOfState(String nameOfState) {
        this.nameOfState = nameOfState;
    }

    public String getNamecapital() {
        return namecapital;
    }

    public void setNamecapital(String namecapital) {
        this.namecapital = namecapital;
    }

    public double getCapitalSquare() {
        return capitalSquare;
    }

    public void setCapitalSquare(double capitalSquare) {
        this.capitalSquare = capitalSquare;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Double.compare(state.capitalSquare, capitalSquare) == 0 &&
                Objects.equals(nameOfState, state.nameOfState) &&
                Objects.equals(namecapital, state.namecapital) &&
                Objects.equals(regions, state.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfState, namecapital, capitalSquare, regions);
    }

    @Override
    public String toString() {
        return "State{" +
                "nameOfState='" + nameOfState + '\'' +
                ", namecapital='" + namecapital + '\'' +
                ", capitalSquare=" + capitalSquare +
                ", regions=" + regions +
                '}';
    }
}
