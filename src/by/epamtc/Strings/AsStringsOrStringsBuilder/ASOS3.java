package by.epamtc.Strings.AsStringsOrStringsBuilder;

import java.util.Scanner;

/*
3. Проверить, является ли заданное слово палиндромом.
 */
public class ASOS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str).reverse();
        String strRev = sb.toString();
        if (str.equals(strRev)) System.out.println("Это полиндром!");
        else System.out.println("Не полиндром.");
    }
}
