package by.epamtc.BasicsOfSoftwareCodeDevelopment.Branches;

/*
2. Найти max{min(a, b), min(c, d)}.
 */
public class Br2 {
    public static void main(String[] args) {
        double a = 1.1, b = 2.2, c = 3.3, d = 4.4, result;
        result = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println(result);
    }
}
