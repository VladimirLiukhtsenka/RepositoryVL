package by.epamtc.Algorithmization.Decomposition;

import java.util.Scanner;

/*
1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел: HOK(A,B)=A*B/НОД(A*B).
 */
public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое натуральное число:");
        String text = sc.next();
        int firstNumber = Integer.parseInt(text);
        System.out.println("Введите второе натуральное число:");
        text = sc.next();
        int secondNumber = Integer.parseInt(text);
        System.out.println("НОД для " + firstNumber + " и " + secondNumber + " : " + NOD(firstNumber, secondNumber));
        System.out.println("НОK для " + firstNumber + " и " + secondNumber + " : " + NOK(firstNumber, secondNumber));
    }

    private static int NOD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else b = b % a;
        }
        return (a + b);
    }

    private static int NOK(int a, int b) {
        return a * b / NOD(a, b);
    }
}
