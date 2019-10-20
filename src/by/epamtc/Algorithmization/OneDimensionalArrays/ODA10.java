package by.epamtc.Algorithmization.OneDimensionalArrays;

import java.util.Arrays;

/*
10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class ODA10 {
    public static void main(String[] args) {
        int n = 15;
        int tempZero;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 2; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                tempZero = array[j - 1];
                array[j - 1] = array[j];
                array[j] = tempZero;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
