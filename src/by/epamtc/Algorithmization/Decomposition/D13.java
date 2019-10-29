package by.epamtc.Algorithmization.Decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
Для решения задачи использовать декомпозицию.
 */
public class D13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число больше 2: ");
        int n = sc.nextInt();
        PrintTwins(n);
    }

    private static void PrintTwins(int n) {
        int[] array = new int[0];
        for (int i = n; i <= 2 * n; i++) {
            if (i + 2 <= 2 * n) {
                array = AddToArray(array, i);
                array = AddToArray(array, i + 2);
                System.out.println(Arrays.toString(array));
                array = new int[0];
            }
        }
    }

    private static int[] AddToArray(int[] array, int a) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = a;
        return array;
    }
}
