package by.epamtc.Algorithmization.OneDimensionalArrays;

import java.util.Arrays;

/*
2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */
public class ODA2 {
    public static void main(String[] args) {
        double z = 8.22;
        int count = 0;
        double[] array = {1.23, 23, 2, 34.23, 4, 56, 6, 8.23, 45, 32, 23, 4, 32};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(array) + " количество замен: " + count);
    }
}
