package by.epamtc.ProgrammingWithClasses.AggregationAndComposition.AAC2.beans;

import java.util.Objects;

public class Wheel {
    String type;

    public Wheel(String type) {
        this.type = type;
    }

    public Wheel() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Objects.equals(type, wheel.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "type='" + type + '\'' +
                '}';
    }
}
