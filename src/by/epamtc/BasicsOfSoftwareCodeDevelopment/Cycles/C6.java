package by.epamtc.BasicsOfSoftwareCodeDevelopment.Cycles;

/*
6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class C6 {
    public static void main(String[] args) {
        char A = 'A', B = 'B', C = 'C', D = 'D', E = 'E', F = 'F', G = 'G', a = 'a', b = 'b', c = 'c', d = 'd', e = 'e', f = 'f', g = 'g';
        char[] arrchar = {A, B, C, D, E, F, G, a, b, c, d, e, f, g};
        for (int i = 0; i < arrchar.length; i++) {
            int ascii = (int) arrchar[i];
            System.out.println("символ: " + arrchar[i] + " его численное обозначение: " + ascii);
        }
    }
}
