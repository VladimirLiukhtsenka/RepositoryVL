package by.epamtc.Strings.AsStringsOrStringsBuilder;

import java.util.Scanner;

/*
5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
public class ASOS5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение содержащее букву “а”: ");
        String str = sc.nextLine();
        int count = 0;
        int start = 0;
        while (start != -1) {
            start = str.indexOf('а', start);
            if (start != -1) {
                start++;
                count++;
            }
        }
        System.out.println("Количество букв “а”: " + count);
    }
}
