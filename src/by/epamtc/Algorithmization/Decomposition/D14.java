package by.epamtc.Algorithmization.Decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n,
равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */
public class D14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число K: ");
        int k = sc.nextInt();
        PrintArmstrNum(k);
    }

    private static void PrintArmstrNum(int k) {
        for (int i = 1; i <= k; i++) {
            if (IsArmstrongNum(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean IsArmstrongNum(int a) {
        int[] ArmstArr = ArrayCreator(a);
        int power = ArmstArr.length;
        int result = 0;
        for (int i = 0; i < ArmstArr.length; i++) {
            result += Math.pow(ArmstArr[i], power);
        }
        return result == a;
    }

    private static int[] ArrayCreator(int n) {
        int[] array = new int[0];
        while (n / 10 > 0) {
            array = AddToArray(array, n % 10);
            n /= 10;
        }
        array = AddToArray(array, n);
        return array;
    }

    private static int[] AddToArray(int[] array, int a) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = a;
        return array;
    }
}
