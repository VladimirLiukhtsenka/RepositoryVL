package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO5;

public class Counter {
    private int minValue;
    private int maxValue;
    private int presentValue;

    public Counter() {
        this.minValue = 0;
        this.maxValue = 10;
        this.presentValue = 5;
    }

    public Counter(int minValue, int maxValue, int presentValue) {
        this.minValue = minValue;

        if (maxValue > minValue) {
            this.maxValue = maxValue;
        } else System.out.println("Неверное задано значение для maxValue!");
        if (presentValue >= minValue && presentValue <= maxValue) {
            this.presentValue = presentValue;
        } else System.out.println("Неверное задано значение для presentValue!");
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getPresentValue() {
        return presentValue;
    }

    public void setPresentValue(int presentValue) {
        this.presentValue = presentValue;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "minValue=" + minValue +
                ", maxValue=" + maxValue +
                ", presentValue=" + presentValue +
                '}';
    }
}
