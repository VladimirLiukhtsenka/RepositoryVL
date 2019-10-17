package by.epamtc.BasicsOfSoftwareCodeDevelopment.LinearProgram;
/*
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */
public class LP5 {
    public static void main(String[] args) {
        int sec, m, min, h;
        int T = 35850;
        sec = T % 60;
        m = (T - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        System.out.println(h + "ч " + min + "мин " + sec + "c");
    }
}
