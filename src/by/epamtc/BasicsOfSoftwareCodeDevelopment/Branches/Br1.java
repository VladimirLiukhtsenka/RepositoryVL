package by.epamtc.BasicsOfSoftwareCodeDevelopment.Branches;

/*
1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 и если да, то будет ли он прямоугольным.
 */
public class Br1 {
    public static void main(String[] args) {
        double angle1 = 45;
        double angle2 = 45;
        double angle3;
        if ((angle1 + angle2) < 180) {
            angle3 = 180 - angle1 - angle2;
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("треугольник прямоугольный");
            } else System.out.println("треугольник существует");
        } else System.out.println("треугольник не существует");
    }
}
