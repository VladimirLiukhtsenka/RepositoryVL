package by.epamtc.BasicsOfSoftwareCodeDevelopment.Cycles;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class C8 {
    public static void main(String[] args) {
        int number1 = 12345, number2 = 5324564;
        String StrNamber1 = Integer.toString(number1);
        String StrNamber2 = Integer.toString(number2);
        int[] arrNumber1 = new int[StrNamber1.length()];
        int[] arrNumber2 = new int[StrNamber2.length()];
        //первое число разбиваем на цифры
        arrNumber1[0] = number1 % 10;
        for (int i = 1; i < arrNumber1.length; i++) {
            number1 = number1 / 10;
            arrNumber1[i] = number1 % 10;
        }
        //второе число разбиваем на цифры
        arrNumber2[0] = number2 % 10;
        for (int i = 1; i < arrNumber2.length; i++) {
            number2 = number2 / 10;
            arrNumber2[i] = number2 % 10;
        }
        //Определяем цифры, входящие в запись как первого так и второго числа(без повторов).
        for (int i = 0; i < arrNumber1.length; i++) {
            for (int j = 0; j < arrNumber2.length; j++) {
                if (arrNumber1[i] == arrNumber2[j]) {
                    System.out.println(arrNumber1[i]);
                    break;
                }
            }
        }
    }
}
