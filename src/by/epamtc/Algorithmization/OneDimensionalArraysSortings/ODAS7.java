package by.epamtc.Algorithmization.OneDimensionalArraysSortings;

import java.util.Arrays;

/*
7. Пусть даны две неубывающие последовательности действительных чисел  a1<=a2<=...<=an и b1<=b2<=...<=bm .
Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class ODAS7 {
    public static void main(String[] args) {
        int[] sequenceA = new int[5];
        int[] sequenceB = new int[5];
        boolean isInsert = false;
        //создаем последовательности
        for (int i = 0; i < sequenceA.length; i++) {
            sequenceA[i] = (int) (Math.random() * 21);
        }
        for (int i = 0; i < sequenceB.length; i++) {
            sequenceB[i] = (int) (Math.random() * 21);
        }
        //сортируем их
        for (int i = sequenceA.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sequenceA[j] > sequenceA[j + 1]) {
                    int temp = sequenceA[j];
                    sequenceA[j] = sequenceA[j + 1];
                    sequenceA[j + 1] = temp;
                }
            }
        }
        for (int i = sequenceB.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sequenceB[j] > sequenceB[j + 1]) {
                    int temp = sequenceB[j];
                    sequenceB[j] = sequenceB[j + 1];
                    sequenceB[1 + j] = temp;
                }
            }
        }
        System.out.println("последовательность sequenceA: " + Arrays.toString(sequenceA));
        System.out.println("последовательность sequenceB: " + Arrays.toString(sequenceB));
        //указываем позиции, куда нужно вставить элементы
        for (int i = 0; i < sequenceB.length; i++) {
            isInsert = false;
            for (int j = 0; j < sequenceA.length; j++) {
                if (sequenceB[i] < sequenceA[j]) {
                    System.out.print("элемент: " + sequenceB[i] + " из sequenceB вставляем в позицию: " + j + " последовательности sequenceA ==> ");
                    sequenceA = Arrays.copyOf(sequenceA, sequenceA.length + 1);
                    for (int k = sequenceA.length - 1 - 1; k >= j; k--) {
                        int temp = sequenceA[k];
                        sequenceA[k] = sequenceA[k + 1];
                        sequenceA[k + 1] = temp;
                    }
                    sequenceA[j] = sequenceB[i];
                    isInsert = true;
                    break;
                }
            }
            if (!isInsert) {
                System.out.print("элемент: " + sequenceB[i] + " из sequenceB вставляем в позицию: " + sequenceA.length + " последовательности sequenceA ==> ");
                sequenceA = Arrays.copyOf(sequenceA, sequenceA.length + 1);
                sequenceA[sequenceA.length - 1] = sequenceB[i];
            }
            System.out.println(Arrays.toString(sequenceA));
        }
    }
}