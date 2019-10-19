package by.epamtc.BasicsOfSoftwareCodeDevelopment.LinearProgram;
/*
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
public class LP4 {
    public static void main(String[] args) {
        double R = 123.456;
        int nnn, ddd;
        nnn = (int) Math.floor(R);
        ddd = (int) ((R - nnn) * 1000);
        System.out.println(ddd + "." + nnn);

    }
}
