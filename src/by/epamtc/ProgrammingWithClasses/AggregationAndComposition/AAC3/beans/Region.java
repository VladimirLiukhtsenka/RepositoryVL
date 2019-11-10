package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3.beans;

import java.util.ArrayList;
import java.util.Objects;

public class Region {
    private City RegionCenter;
    private double square;
    private String nameOfRegion;
    private ArrayList<District> districts;

    public Region(City regionCenter, double square, String nameOfRegion, ArrayList<District> districts) {
        RegionCenter = regionCenter;
        this.square = square;
        this.nameOfRegion = nameOfRegion;
        this.districts = districts;
    }

    public Region(City regionCenter, double square, String nameOfRegion) {
        RegionCenter = regionCenter;
        this.square = square;
        this.nameOfRegion = nameOfRegion;
    }

    public City getRegionCenter() {
        return RegionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        RegionCenter = regionCenter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getNameOfRegion() {
        return nameOfRegion;
    }

    public void setNameOfRegion(String nameOfRegion) {
        this.nameOfRegion = nameOfRegion;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        this.districts = districts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Double.compare(region.square, square) == 0 &&
                Objects.equals(RegionCenter, region.RegionCenter) &&
                Objects.equals(nameOfRegion, region.nameOfRegion) &&
                Objects.equals(districts, region.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RegionCenter, square, nameOfRegion, districts);
    }

    @Override
    public String toString() {
        return "Region{" +
                "RegionCenter=" + RegionCenter +
                ", square=" + square +
                ", nameOfRegion='" + nameOfRegion + '\'' +
                ", districts=" + districts +
                '}';
    }
}
