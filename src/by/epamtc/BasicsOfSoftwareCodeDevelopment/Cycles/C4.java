package by.epamtc.BasicsOfSoftwareCodeDevelopment.Cycles;

/*
4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class C4 {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 1; i <= 200; i++) {
            result *= Math.pow(i, 2);
        }
        System.out.println(result);
    }
}
