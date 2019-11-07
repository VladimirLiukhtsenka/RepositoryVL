package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO5;

public class CounterLogic {

    public void increaseCounter(Counter counter) {
        if (counter.getPresentValue() + 1 >= counter.getMinValue() &&
                counter.getPresentValue() + 1 <= counter.getMaxValue()) {
            counter.setPresentValue(counter.getPresentValue() + 1);
        } else System.out.println(" Невозможн увечить значение счетчика");
    }

    public void reduceCounter(Counter counter) {
        if (counter.getPresentValue() - 1 >= counter.getMinValue() &&
                counter.getPresentValue() - 1 <= counter.getMaxValue()) {
            counter.setPresentValue(counter.getPresentValue() - 1);
        } else System.out.println(" Невозможн уменьшить значение счетчика");
    }
}
