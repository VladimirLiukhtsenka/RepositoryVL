package by.epamtc.Algorithmization.OneDimensionalArrays;

/*
1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class ODA1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int result = 0;
        for (int value : array) {
            if (value % k == 0) {
                result += value;
            }
        }
        System.out.println(result);
    }
}
