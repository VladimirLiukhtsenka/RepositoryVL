package by.epamtc.BasicsOfSoftwareCodeDevelopment.Branches;

/*
3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
 Определить, будут ли они расположены на одной прямой.
 */
public class Br3 {
    public static void main(String[] args) {
        double x1 = -2;
        double y1 = 5;
        double x2 = 4;
        double y2 = 3;
        double x3 = 16;
        double y3 = -1;
        if ((x2 - x1) * (y3 - y1) == (x3 - x1) * (y2 - y1)) {
            System.out.println("Точки лежат на одной прямой");
        } else System.out.println("Точки не лежат на одной прямой");
    }
}
