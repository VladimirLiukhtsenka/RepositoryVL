package by.epamtc.BasicsOfSoftwareCodeDevelopment.LinearProgram;
/*
2. Вычислить значение выражения по формуле (все переменные принимают действительные значения): (𝑏+√(𝑏^2+4𝑎𝑐))/2𝑎−𝑎^3𝑐+𝑏^−2
 */
public class LP2 {
    public static void main(String[] args) {
        double a = 1.1, b = 2.2, c = 3.3, total;
        total = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) + Math.pow(b, -2);
        System.out.println(total);
    }
}
