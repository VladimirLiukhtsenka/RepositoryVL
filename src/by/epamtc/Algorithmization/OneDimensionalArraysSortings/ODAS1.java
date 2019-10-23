package by.epamtc.Algorithmization.OneDimensionalArraysSortings;

import java.util.Arrays;

/*
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */
public class ODAS1 {
    public static void main(String[] args) {
        int[] arrayFirst = {1, 2, 3, 4, 5};
        int[] arraySecond = {6, 7, 8};
        int k = 2;
        int temp;

        arrayFirst = Arrays.copyOf(arrayFirst, arrayFirst.length + arraySecond.length);
        for (int i = arrayFirst.length - 1 - arraySecond.length; i >= k; i--) {
            temp = arrayFirst[i];
            arrayFirst[i] = arrayFirst[i + arraySecond.length];
            arrayFirst[i + arraySecond.length] = temp;
        }
        // System.arraycopy(arraySecond, 0, arrayFirst, 0 + k, arraySecond.length);
        for (int i = 0; i < arraySecond.length; i++) {
            arrayFirst[i + k] = arraySecond[i];
        }
        System.out.println(Arrays.toString(arrayFirst));
    }
}
