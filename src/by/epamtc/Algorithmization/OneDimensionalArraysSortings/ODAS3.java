package by.epamtc.Algorithmization.OneDimensionalArraysSortings;

import java.util.Arrays;

/*
3. Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an.Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */
public class ODAS3 {
    public static void main(String[] args) {
        int[] sequence = {1, 1, 1, 2, 3, 3, 4, 6, 8, 8, 9, 13, 25, 42, 119, 121};
        for (int i = 0; i < sequence.length; i++) {
            int pos = i;
            for (int j = i; j < sequence.length; j++) {
                if (sequence[pos] < sequence[j]) {
                    pos = j;
                }
            }
            int temp = sequence[pos];
            sequence[pos] = sequence[i];
            sequence[i] = temp;
        }
        System.out.println(Arrays.toString(sequence));
    }
}
