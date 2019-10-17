package by.epamtc.BasicsOfSoftwareCodeDevelopment.Branches;

/*
4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 Определить, пройдет ли кирпич через отверстие.
 */
public class Br4 {
    public static void main(String[] args) {
        double A = 30;
        double B = 7;
        double x = 6.5;
        double y = 12.5;
        double z = 25;
        if ((x < A && y < B || x < B && y < A)
                || (x < A && z < B || (x < B && z < A))
                || (y < A && z < B || y < B && z < A)) {
            System.out.println("Пройдет");
        } else System.out.println("Не пройдет");
    }
}
