package by.epamtc.Strings.AsStringsOrStringsBuilder;

import java.util.Scanner;

/*
9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
Учитывать только английские буквы.
 */
public class ASOS9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст на английском: ");
        String str = sc.nextLine();
        String lowerCase = "abcdefghilklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int countLowerCase = 0;
        int countUpperCase = 0;
        for (int i = 0; i < str.length(); i++) {
            if (lowerCase.indexOf(str.charAt(i)) >= 0) {
                countLowerCase++;
            } else if (upperCase.indexOf(str.charAt(i)) >= 0) {
                countUpperCase++;
            }
        }
        System.out.println("Строчных букв: " + countLowerCase);
        System.out.println("Прописных букв: " + countUpperCase);
    }
}
