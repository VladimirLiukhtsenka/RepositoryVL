package by.epamtc.Algorithmization.OneDimensionalArrays;

import java.util.Arrays;

/*
9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */
public class ODA9 {
    public static void main(String[] args) {
        int n = 15;
        int[] array = new int[n];
        int[] periodicity = new int[n];
        int countPeriod = 0;
        int maxPeriod = periodicity[0];
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println("array:\t\t " + Arrays.toString(array));
        //заполняем массив частоты встречающихся чисел
        for (int i = 0; i < array.length; i++) {
            for (int value : array) {
                if (array[i] == value) {
                    countPeriod++;
                }
            }
            periodicity[i] = countPeriod;
            countPeriod = 0;
        }
        System.out.println("periodicity: " + Arrays.toString(periodicity));
        //находим наибольшее число повторений
        for (int value : periodicity) {
            if (maxPeriod < value) {
                maxPeriod = value;
            }
        }
        //находим минимальное из наиболее встречающихся чисел
        for (int i = 0; i < periodicity.length; i++) {
            if (periodicity[i] == maxPeriod) {
                if (minNumber > array[i]) {
                    minNumber = array[i];
                }
            }
        }
        System.out.println("Наиболее часто встречающееся(минимальное) число: " + minNumber);
    }
}
