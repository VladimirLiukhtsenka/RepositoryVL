package by.epamtc.Algorithmization.Decomposition;

import java.util.Arrays;

/*
12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class D12 {
    public static void main(String[] args) {
        int k = 11;
        int n = 200;
        System.out.println(Arrays.toString(DesiredArr(k, n)));

    }

    private static int[] DesiredArr(int k, int n) {
        int[] arrayDes = new int[0];
        for (int i = 0; i <= n; i++) {
            if (IsEqual(i, k)) {
                arrayDes = AddToArray(arrayDes, i);
            }
        }
        return arrayDes;
    }

    private static int[] AddToArray(int[] array, int a) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = a;
        return array;
    }

    private static boolean IsEqual(int n, int k) {
        int[] array = new int[0];
        while (n / 10 > 0) {
            array = AddToArray(array, n % 10);
            n /= 10;
        }
        array = AddToArray(array, n);
        int sumDigitArr = SumArrElem(array);
        return k == sumDigitArr;

    }

    private static int SumArrElem(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
