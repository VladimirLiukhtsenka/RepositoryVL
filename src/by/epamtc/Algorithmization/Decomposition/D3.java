package by.epamtc.Algorithmization.Decomposition;

import java.util.Scanner;

/*
3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.
 */
public class D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0;
        while (a <= 0) {
            System.out.print("Введите размер стороны \"a\": ");
            String text = sc.next();
            a = Double.parseDouble(text);
        }
        System.out.printf("%7.3f", RegularHexagonArea(a));
    }

    private static double TriangleArea(double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    private static double RegularHexagonArea(double a) {
        return TriangleArea(a, a, a) * 6;
    }
}
