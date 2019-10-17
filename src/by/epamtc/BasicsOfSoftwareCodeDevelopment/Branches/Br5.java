package by.epamtc.BasicsOfSoftwareCodeDevelopment.Branches;

import java.util.Scanner;

/*
5. Вычислить значение функции:
если x<=3 : x^2-3x+9
если x>3 : 1/(x^3+6)
 */
public class Br5 {
    public static void main(String[] args) {
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x (например 4.0):");
        double x = Double.parseDouble(sc.nextLine());
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else if (x > 3) {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(result);
    }
}
