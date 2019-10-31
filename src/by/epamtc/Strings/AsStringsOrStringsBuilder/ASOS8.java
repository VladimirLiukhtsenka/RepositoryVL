package by.epamtc.Strings.AsStringsOrStringsBuilder;

import java.util.Scanner;

/*
8. Вводится строка слов, разделенных пробелами.
Найти самое длинное слово и вывести его на экран.
Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */
public class ASOS8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова, разделеные пробелами: ");
        String str = sc.nextLine();
        String[] words = str.split("[ ]+");
        String longWord = "";
        for (String word : words) {
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }
        System.out.println("Cамое длинное слово: " + longWord);
    }
}
