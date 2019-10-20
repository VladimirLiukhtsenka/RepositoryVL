package by.epamtc.Algorithmization.OneDimensionalArrays;

/*
Даны действительные числа a1,a2,...,an . Найти max(a1+a2n,a2+a2n-1,...,an+an+1).
решим max(a1+an,a2+an-1,a3+an-2...)
 */
public class ODA7 {
    public static void main(String[] args) {
        double[] array = {2.3, -1, 5.34, 6, 34.1, 3, -6, 23, 9, 12.2, 4};
        double[] arrayTotal = new double[array.length / 2];
        int count = 0;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length / 2; i++) {
            arrayTotal[i] = array[i] + array[array.length - 1 - count];
            count++;
        }
        for (double v : arrayTotal) {
            if (max < v) {
                max = v;
            }
        }
        System.out.println(max);
    }
}
