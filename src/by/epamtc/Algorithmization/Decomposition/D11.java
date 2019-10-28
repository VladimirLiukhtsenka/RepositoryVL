package by.epamtc.Algorithmization.Decomposition;

import java.util.Scanner;

/*
11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class D11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Введите первое число: ");
        str = sc.next();
        int A = Integer.parseInt(str);
        System.out.println("Введите второе число: ");
        str = sc.next();
        int B = Integer.parseInt(str);
        MoreNum(A, B);
    }

    private static int HowManyDigits(int x) {
        String strX = Integer.toString(x);
        strX = strX.replace("-", "");
        return strX.length();
    }

    private static void MoreNum(int first, int second) {
        int firstD = HowManyDigits(first);
        int secondD = HowManyDigits(second);
        if (firstD > secondD) {
            System.out.println("Первое число: " + first + " имеет больше цифр");
        } else if (secondD > firstD) {
            System.out.println("Второе число: " + second + " имеет больше цифр");
        } else {
            System.out.println("Оба числа имеют одинаковое количество цифр");
        }
    }
}
