package by.epamtc.BasicsOfSoftwareCodeDevelopment.Cycles;

/*
2. Вычислить значения функции на отрезке [а,b] c шагом h: у=
x,x>2
-x,x<=2
 */
public class C2 {
    public static void main(String[] args) {
        double a = -4, b = 4, h = 0.5, x, y;
        for (x = a; x <= b; x += h) {
            if (x > 2) {
                y = x;
                System.out.println("при x равном: " + x + " y равен: " + y);
            } else if (x <= 2) {
                y = -x;
                System.out.println("при x равном: " + x + " y равен: " + y);
            }
        }
    }
}
