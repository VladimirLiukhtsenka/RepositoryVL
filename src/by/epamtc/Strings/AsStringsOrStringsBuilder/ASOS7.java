package by.epamtc.Strings.AsStringsOrStringsBuilder;

import java.util.Scanner;

/*
7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */
public class ASOS7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder buffer = new StringBuilder(" ");
        for (int i = 0; i < str.length(); i++) {
            if (buffer.indexOf(String.valueOf(str.charAt(i))) < 0) {
                sb.append(str.charAt(i));
                buffer.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
