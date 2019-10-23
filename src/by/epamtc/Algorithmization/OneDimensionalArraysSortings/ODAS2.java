package by.epamtc.Algorithmization.OneDimensionalArraysSortings;

import java.util.Arrays;

/*
2. Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm . Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class ODAS2 {
    public static void main(String[] args) {
        int[] firstSequence = {1, 2, 3, 3, 4, 6, 9};
        int[] secondSequence = {1, 1, 8, 8, 13, 25, 42, 119, 121};
        int pos = firstSequence.length;
        int temp;
        firstSequence = Arrays.copyOf(firstSequence, firstSequence.length + secondSequence.length);
        System.arraycopy(secondSequence, 0, firstSequence, pos, secondSequence.length);
        for (int i = firstSequence.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if (firstSequence[j] > firstSequence[j+1]) {
                    temp = firstSequence[j];
                    firstSequence[j] = firstSequence[j+1];
                    firstSequence[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(firstSequence));
    }
}
