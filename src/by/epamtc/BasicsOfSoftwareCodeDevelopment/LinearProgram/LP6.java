package by.epamtc.BasicsOfSoftwareCodeDevelopment.LinearProgram;
/*
Для данной области составить линейную программу, которая печатает true,
 если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 */
public class LP6 {
    public static void main(String[] args) {
        double x = 1.4;
        double y = -3.0;
        if ((x >= -4 && x <= 4 && y >= -3 && y <= 0) ||
                (x >= -2 && x <= 2 && y <= 4 && y >= 0)) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
