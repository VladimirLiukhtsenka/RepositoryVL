package by.epamtc.Algorithmization.Decomposition;


import java.util.Arrays;
import java.util.Scanner;

/*
10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N.
 */
public class D10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = sc.nextInt();
        System.out.println(Arrays.toString(ArrayCreator(n)));
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
