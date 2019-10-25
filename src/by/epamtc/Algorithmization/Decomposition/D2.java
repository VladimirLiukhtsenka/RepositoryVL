package by.epamtc.Algorithmization.Decomposition;

import java.util.Scanner;

/*
2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое натуральное число:");
        String text = sc.next();
        int firstNumber = Integer.parseInt(text);
        System.out.println("Введите второе натуральное число:");
        text = sc.next();
        int secondNumber = Integer.parseInt(text);
        System.out.println("Введите третье натуральное число:");
        text = sc.next();
        int thirdNumber = Integer.parseInt(text);
        System.out.println("Введите четвертое натуральное число:");
        text = sc.next();
        int fourthNumber = Integer.parseInt(text);
        System.out.println("НОД для " + firstNumber + ", " + secondNumber + ", " + thirdNumber + ", " +
                fourthNumber + " : " + NodFour(firstNumber, secondNumber, thirdNumber, fourthNumber));
    }

    private static int NodTwo(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else b = b % a;
        }
        return (a + b);
    }

    private static int NodFour(int a1, int a2, int a3, int a4) {
        int d1 = NodTwo(a1, a2);
        int d2 = NodTwo(d1, a3);
        return NodTwo(d2, a4);
    }
}
