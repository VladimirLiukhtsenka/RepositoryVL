package by.epamtc.Algorithmization.OneDimensionalArrays;

/*
5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class ODA5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
