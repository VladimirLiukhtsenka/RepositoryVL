package by.epamtc.BasicsOfSoftwareCodeDevelopment.Cycles;

import java.util.Scanner;

/*
1. Напишите программу, где пользователь вводит любое целое положительное число.
 А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class C1 {
    public static void main(String[] args) {
        int result = 0, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите через пробел любое целое положительное число:");
        x = Integer.valueOf(sc.next());
        for (int i = 1; i < x; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
