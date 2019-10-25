package by.epamtc.Algorithmization.Decomposition;

import java.util.Arrays;

/*
5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class D5 {
    public static void main(String[] args) {

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 51);
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Второе по величине число: " + SecondLargest(array));
    }

    private static int SecondLargest(int[] arr) {
        int posMax = 0;
        int max = arr[0];
        int secMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                posMax = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (secMax < arr[i] && i != posMax) {
                secMax = arr[i];
            }
        }
        return secMax;
    }
}
