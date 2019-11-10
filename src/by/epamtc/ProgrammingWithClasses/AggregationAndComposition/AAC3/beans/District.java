package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC3.beans;

import java.util.Objects;

public class District {
    private City DistrictCenter;
    private double square;
    private String nameOfDistrict;

    public District(City districtCenter, double square, String nameOfDistrict) {
        DistrictCenter = districtCenter;
        this.square = square;
        this.nameOfDistrict = nameOfDistrict;
    }

    public City getDistrictCenter() {
        return DistrictCenter;
    }

    public void setDistrictCenter(City districtCenter) {
        DistrictCenter = districtCenter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getNameOfDistrict() {
        return nameOfDistrict;
    }

    public void setNameOfDistrict(String nameOfDistrict) {
        this.nameOfDistrict = nameOfDistrict;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Double.compare(district.square, square) == 0 &&
                Objects.equals(DistrictCenter, district.DistrictCenter) &&
                Objects.equals(nameOfDistrict, district.nameOfDistrict);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DistrictCenter, square, nameOfDistrict);
    }

    @Override
    public String toString() {
        return "District{" +
                "DistrictCenter=" + DistrictCenter +
                ", square=" + square +
                ", nameOfDistrict='" + nameOfDistrict + '\'' +
                '}';
    }
}
