package by.epamtc.Algorithmization.OneDimensionalArraysSortings;

import java.util.Arrays;

/*
4. Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=an.Требуется переставить числа в
порядке возрастания(!убывания!). Для этого сравниваются два соседних числа ai и ai+1 . Если ai>ai+1 , то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class ODAS4 {
    public static void main(String[] args) {
        int[] sequence = {1, 1, 1, 2, 3, 3, 4, 6, 8, 8, 9, 13, 25, 42, 119, 121};
        int countTransPos = 0;
        for (int i = sequence.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sequence[j] < sequence[j + 1]) {
                    int temp = sequence[j];
                    sequence[j] = sequence[j + 1];
                    sequence[j + 1] = temp;
                    countTransPos++;
                }
            }
        }
        System.out.println(Arrays.toString(sequence));
        System.out.println("количество перестановок: " + countTransPos);
    }
}
