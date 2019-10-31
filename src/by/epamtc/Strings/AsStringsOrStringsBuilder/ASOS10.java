package by.epamtc.Strings.AsStringsOrStringsBuilder;

import java.util.Scanner;

/*
10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
Определить количество предложений в строке X.
 */
public class ASOS10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нескольких предложений, каждое из которых кончается точкой, " +
                "восклицательным или вопросительным знаком: ");
        String str = sc.nextLine();
        String[] sentences = str.split("[?!.]+");
        System.out.println("Количество предложений: "+ sentences.length);
    }
}
