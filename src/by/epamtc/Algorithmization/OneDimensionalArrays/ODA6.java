package by.epamtc.Algorithmization.OneDimensionalArrays;

import java.util.Arrays;

/*
6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */
public class ODA6 {
    private static boolean IsprimeNumber(int index) {
        if (index == 0 || index == 1) {
            return false;
        }
        for (int i = 2; i < index; i++) {
            if (index % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        double sum = 0;
        int n = 15;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 11 - 5;
            if (ODA6.IsprimeNumber(i)) {
                sum += array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("%3.3f", sum);
    }
}
