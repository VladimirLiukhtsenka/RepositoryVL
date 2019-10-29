package by.epamtc.Algorithmization.Decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
Для решения задачи использовать декомпозицию.
 */
public class D15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество порядков (больше одного): ");
        int k = sc.nextInt();
        PrintInscreasSeq(k);
    }

    private static void PrintInscreasSeq(int k) {
        for (int i = 12; i < Math.pow(10, k); i++) {
            if (IsIncreasingSequence(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean IsIncreasingSequence(int n) {
        int[] arr = ArrayCreator(n);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }
        return true;
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
