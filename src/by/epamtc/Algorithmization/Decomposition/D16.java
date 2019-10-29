package by.epamtc.Algorithmization.Decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class D16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество порядков : ");
        int k = sc.nextInt();
        int sum = SumOddNum(k);
        System.out.println(" Сумма " + k + "-значных чисел, содержащих только нечетные цифры: " + sum);
        System.out.println("Четных цифр в найденной сумме: " + HowManyEvenNum(sum));
    }

    private static int HowManyEvenNum(int h) {
        int[] arrh = ArrayCreator(h);
        int count = 0;
        for (int i = 0; i < arrh.length; i++) {
            if (!IsOddNumber(arrh[i])) {
                count++;
            }
        }
        return count;
    }

    private static int SumOddNum(int k) {
        int sum = 0;
        for (int i = 1; i < Math.pow(10, k); i++) {
            if (IsAllOddNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean IsAllOddNumber(int a) {
        int[] arr = ArrayCreator(a);
        for (int i = 0; i < arr.length; i++) {
            if (!IsOddNumber(arr[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean IsOddNumber(int n) {
        return n % 2 != 0;
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
