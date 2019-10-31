package by.epamtc.Strings.AsStringsOrStringsBuilder;

import java.util.Scanner;

/*
6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class ASOS6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        String strNew = sb.toString();
        System.out.println(strNew);
    }
}
