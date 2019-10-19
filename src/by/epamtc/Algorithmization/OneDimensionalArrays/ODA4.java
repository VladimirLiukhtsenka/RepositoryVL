package by.epamtc.Algorithmization.OneDimensionalArrays;

import java.util.Arrays;

/*
4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class ODA4 {
    public static void main(String[] args) {
        double[] array = {2, 1, 5, 6, 34, 3, 5, 23, 9, 45, 2, 4};
        double maxElement = array[0];
        double minElement = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                maxIndex = i;
            }
            if (minElement > array[i]) {
                minElement = array[i];
                minIndex = i;
            }
        }
        temp = (int) array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;
        System.out.println(Arrays.toString(array));
    }
}
