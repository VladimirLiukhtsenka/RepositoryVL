package by.epamtc.BasicsOfSoftwareCodeDevelopment.LinearProgram;
/*
3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):(𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦) / (𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡𝑔 𝑥𝑦
 */
public class LP3 {
    public static void main(String[] args) {
        double x = 0.3, y = 0.4, total;
        total = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(total);
    }
}
