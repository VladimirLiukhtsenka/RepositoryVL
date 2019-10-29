package by.epamtc.Algorithmization.Decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class D17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int k = sc.nextInt();
        System.out.println("Необходимо произвести действий: " + OperationCounter(k));
    }

    private static int OperationCounter(int k) {
        int num = k;
        int count = 0;
        while (num > 0) {
            num -= SumDigitals(num);
            count++;
        }
        return count;
    }

    private static int SumDigitals(int s) {
        int sum = 0;
        int[] arrs = ArrayCreator(s);
        for (int i = 0; i < arrs.length; i++) {
            sum += arrs[i];
        }
        return sum;
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
