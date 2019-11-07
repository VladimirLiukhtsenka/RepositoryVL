package by.epamtc.ProgrammingWithClasses.SimplestClassesAndObjects.SCAO6;


/*
6. Составьте описание класса для представления времени.
Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
с проверкой допустимости вводимых значений. В случае недопустимых значений полей поле устанавливается в значение 0.
Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
public class Main {
    public static void main(String[] args) {
        //установка времени
        Time time = new Time(23, 0, 2);
        //изменения его отдельных полей
        time.setSecond(70);
        time.setHour(2);
        System.out.println(time);
        TimeLogic timeLogic = new TimeLogic(time);
        //изменения времени на заданное количество минут
        timeLogic.changeMinutes(15);
        System.out.println(time);
    }
}
