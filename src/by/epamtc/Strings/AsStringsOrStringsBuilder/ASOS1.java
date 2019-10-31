package by.epamtc.Strings.AsStringsOrStringsBuilder;

import java.util.Scanner;

/*
1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class ASOS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int countMax = 0;
        System.out.println("Введите предложение: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == ' ') {
                count++;
            } else {
                if (count > countMax) {
                    countMax = count;
                    count = 0;
                }
            }
        }
        System.out.println("Наибольшее количество подряд идущих пробелов: " + countMax);
    }
}
