package by.epamtc.Algorithmization.Decomposition;

/*
7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class D7 {
    public static void main(String[] args) {
        int sumFact = 0;
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                sumFact += Factorial(i);
            }
        }
        System.out.println(sumFact);
    }

    private static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
