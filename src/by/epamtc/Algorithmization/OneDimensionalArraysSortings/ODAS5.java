package by.epamtc.Algorithmization.OneDimensionalArraysSortings;

import java.util.Arrays;

/*
5. Сортировка вставками. Дана последовательность чисел a1,a2,...an  . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1,a2,...ai  - упорядоченная последовательность, т. е.
a1<=a2<=...<=an. Берется следующее число ai+1 a и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class ODAS5 {
    public static void main(String[] args) {
        int[] sequence = new int[15];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = (int) (Math.random() * 21);
        }
        System.out.println(Arrays.toString(sequence));
        for (int left = 0; left < sequence.length; left++) {
            int value = sequence[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < sequence[i]) {
                    sequence[i + 1] = sequence[i];
                } else break;
            }
            sequence[i + 1] = value;
        }
        System.out.println(Arrays.toString(sequence));
    }
}
