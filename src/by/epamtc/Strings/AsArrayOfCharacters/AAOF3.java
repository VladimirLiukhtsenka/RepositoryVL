package by.epamtc.Strings.AsArrayOfCharacters;

import java.util.Arrays;
import java.util.Scanner;

/*
3. В строке найти количество цифр.
 */
public class AAOF3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Введите предложение содержащее цифры: ");
        String str = sc.nextLine();
        String digitals = "0123456789";
        char[] partStr = str.toCharArray();
        for (int i = 0; i < partStr.length; i++) {
            if (digitals.indexOf(partStr[i]) > 0) {
                count++;
            }
        }
        System.out.println("Количество цифр: " + count);
    }
}
