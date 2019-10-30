package by.epamtc.Strings.AsArrayOfCharacters;

import java.util.Scanner;

/*
4. В строке найти количество чисел.
 */
public class AAOF4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Введите предложение содержащее числа: ");
        String str = sc.nextLine();
        String digitals = "0123456789";
        char[] partStr = str.toCharArray();
        for (int i = 0; i < partStr.length - 1; i++) {
            if (digitals.indexOf(partStr[i]) > 0 && digitals.indexOf(partStr[i + 1]) < 0) {
                count++;
            }
        }
        if (digitals.indexOf(partStr[partStr.length - 1]) > 0) {
            count++;
        }
        System.out.println("Количество чисел: " + count);
    }
}

