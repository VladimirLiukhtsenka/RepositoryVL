package by.epamtc.Algorithmization.OneDimensionalArraysSortings;

import java.util.Arrays;

/*
6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai<=ai+1 , то продвигаются
на один элемент вперед. Если ai>ai+1 , то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */
public class ODAS6 {
    public static void main(String[] args) {
        int[] sequence = new int[15];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = (int) (Math.random() * 21);
        }
        System.out.println(Arrays.toString(sequence));
        int gap = sequence.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < sequence.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (sequence[c] > sequence[c + gap]) {
                        int temp = sequence[c];
                        sequence[c] = sequence[c + gap];
                        sequence[c + gap] = temp;
                    }
                }
            }
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(sequence));
    }
}
