package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO5;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.
 */
public class Main {
    public static void main(String[] args) {
        //инициализация счетчика значениями по умолчанию
        Counter counter = new Counter();
        //инициализация счетчика произвольными значениями
        Counter counter1 = new Counter(-5, 5, 0);
        System.out.println(counter1);
        CounterLogic counterLogic = new CounterLogic();
        //метод увеличения
        counterLogic.increaseCounter(counter1);
        //counter1.getPresentValue() - метод позволяющи1 получить его текущее состояние
        System.out.println(counter1.getPresentValue());
        //методы уменьшения
        counterLogic.reduceCounter(counter1);
        counterLogic.reduceCounter(counter1);
        System.out.println(counter1.getPresentValue());
    }
}
