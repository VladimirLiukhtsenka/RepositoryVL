package by.epamtc.Algorithmization.OneDimensionalArrays;

import java.util.Arrays;

/*
3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */
public class ODA3 {
    public static void main(String[] args) {
        int n = 15;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 11 - 5;
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            } else zero++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("отрицательных элементов: " + negative + " положительных: " + positive + " нулевых: " + zero);
    }
}
