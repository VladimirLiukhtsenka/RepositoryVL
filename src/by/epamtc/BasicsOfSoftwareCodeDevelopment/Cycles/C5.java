package by.epamtc.BasicsOfSoftwareCodeDevelopment.Cycles;

/*
5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:An = 1/2^n + 1/3^n.
 */
public class C5 {
    public static void main(String[] args) {
        double e = 0.1, a, result = 0;
        int n = 100;
        for (int i = 1; i <= n; i++) {
            a = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));
            if (Math.abs(a) >= e) {
                result += a;
            }
        }
        System.out.println(result);
    }
}
