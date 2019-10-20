package by.epamtc.Algorithmization.OneDimensionalArrays;

import java.util.Arrays;

/*
8. Дана последовательность целых чисел a1,a2,...,an. Образовать новую последовательность, выбросив из
исходной те члены, которые равны min(a1,a2,...,an).
 */
public class ODA8 {
    public static void main(String[] args) {
        int[] array = {-2, 2, -1, 5, 7, 4, 6, 3, 34, 12, -2, 34, 3, 5, -2};
        int minNumber = array[0];
        int arrTotalPosCount = 0;
        int minCount = 0;
        for (int value : array) {
            if (minNumber > value) {
                minNumber = value;
            }
        }
        for (int value : array) {
            if (minNumber == value) {
                minCount++;
            }
        }
        int[] arrayTotal = new int[array.length - minCount];
        for (int value : array) {
            if (value > minNumber) {
                arrayTotal[arrTotalPosCount] = value;
                arrTotalPosCount++;
            }
        }
        System.out.println(Arrays.toString(arrayTotal));
    }
}

