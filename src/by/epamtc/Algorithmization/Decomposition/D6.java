package by.epamtc.Algorithmization.Decomposition;

import java.util.Scanner;

/*
6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class D6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое  число:");
        String text = sc.next();
        int firstNumber = Integer.parseInt(text);
        System.out.println("Введите второе  число:");
        text = sc.next();
        int secondNumber = Integer.parseInt(text);
        System.out.println("Введите третье  число:");
        text = sc.next();
        int thirdNumber = Integer.parseInt(text);
        System.out.println("Эти числа взаимнопростые?: " + IsThreeSimpleNumbers(firstNumber, secondNumber, thirdNumber));
    }

    private static int NodTwo(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else b = b % a;
        }
        return (a + b);
    }

    private static boolean IsThreeSimpleNumbers(int a1, int a2, int a3) {
        int d1 = NodTwo(a1, a2);
        int d2 = NodTwo(d1, a3);
        return d2 == 1;
    }
}
